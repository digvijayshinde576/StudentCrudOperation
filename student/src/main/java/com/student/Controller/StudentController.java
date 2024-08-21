package com.student.Controller;

import com.student.Entity.Order;
import com.student.Entity.PaymentDetails;
import com.student.Entity.ShippingDetails;
import com.student.Entity.Student;
import com.student.Service.OrderService;
import com.student.Service.PaymentService;
import com.student.Service.ShippingDetailsService;
import com.student.Service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
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


    @GetMapping("/pair")
    public static Pair<Order, ShippingDetails> getOrderInfo(){
        int orderId=111;
        Order order = OrderService.getOrderById(orderId);
        ShippingDetails shippingDetails = ShippingDetailsService.getShippingDetails(orderId);
        return Pair.of(order,shippingDetails);

    }

    @GetMapping("/triple")
    public  static Triple<Order, ShippingDetails, PaymentDetails> getOrderFullInfo(){
        int orderid=111;
        Order order = OrderService.getOrderById(orderid);
        ShippingDetails shippingDetails = ShippingDetailsService.getShippingDetails(orderid);
        PaymentDetails paymentDetails = PaymentService.getPaymentDetails(orderid);

        return Triple.of(order,shippingDetails,paymentDetails);

    }

    @GetMapping("{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        log.info("Controller Post Method Called");

        //return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);

    return  new ResponseEntity<>(studentService.addStudent(student),HttpStatus.CREATED);
    }

//    @PostMapping
//    public String addStudent(@RequestBody Student student) {
//        log.info("Controller Post Method Called");
//       // return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
//        Student student1 = studentService.addStudent(student);
//        return "Student Added"+student1+
//                "Student Addded Successfully.......";
//    }

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
