package com.student.Service;

import com.student.Entity.Student;
import com.student.Repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class StudentServiceImpl implements StudentService{


    @Autowired
    private StudentRepository  studentRepository;



    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll() ;
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student with id "+id +"Deleted .....";
    }

    @Override
    public Student updateStudent(Long id, Student student) {
       Student existingStudent=studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student Not Found....."));

        existingStudent.setStudentName(student.getStudentName());
        existingStudent.setStudentStandard(student.getStudentStandard());
    Student updatedStudent=studentRepository.save(existingStudent);
        return updatedStudent;
    }
}
