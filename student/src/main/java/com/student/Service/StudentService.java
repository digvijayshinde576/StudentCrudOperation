package com.student.Service;

import com.student.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService
{
    public List<Student> getAllStudent();
    public Optional<Student> getStudentById(Long id);
    public Student addStudent(Student student);
    public String deleteStudent(Long id);
    public Student updateStudent(Long id,Student student);

}
