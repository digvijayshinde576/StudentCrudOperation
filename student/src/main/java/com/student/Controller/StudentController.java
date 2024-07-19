package com.student.Controller;
import com.student.Entity.Student;
import com.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<?> getAllStudent(){
        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id){
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.addStudent(student),HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        String message = studentService.deleteStudent(id);
        return ResponseEntity.ok(message);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateStudent(@PathVariable Long id,@RequestBody Student  student){

        return new ResponseEntity<>(studentService.updateStudent(id,student),HttpStatus.ACCEPTED);
    }

}


