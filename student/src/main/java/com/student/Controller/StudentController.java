package com.student.Controller;

import com.student.Entity.Student;
import com.student.Service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@Component
//@Slf4j
public class StudentController {

    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    //private static final Logger log = LoggerFactory.getLogger(StudentController.class);
//private static final Logger log =LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<?> getAllStudent() {
        // Example log message
        log.info("Get Method calling...");
        //log.info("Controller Get method called");
        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        log.info("Controller Post Method Called");
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        String message = studentService.deleteStudent(id);
        return ResponseEntity.ok(message);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return new ResponseEntity<>(studentService.updateStudent(id, student), HttpStatus.ACCEPTED);
    }

}
