package com.student;

import com.student.Entity.Student;
import com.student.Repository.StudentRepository;
import com.student.Service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

@SpringBootTest
class StudentApplicationTests {
	@Autowired
	private StudentService  studentService;

	@MockBean
	private StudentRepository studentRepository;

	@Test
	public void addStudentTest(){
		Student student=new Student(1L,"digvijay ","8","12354634");
		when(studentRepository.save(student)).thenReturn(student);
		Assertions.assertEquals(student,studentService.addStudent(student));
	}

	@Test
	public void getAllStudentTest(){
		when(studentRepository.findAll()).thenReturn(List.of (new Student(1L,"digvijay","8","123412342"),
				new Student(2L,"omkar","7","`1232131`")));
		Assertions.assertEquals(2,studentService.getAllStudent().size());
		verify(studentRepository,times(1));

	}

	@Test
	public void getStudentByIdTest(){
		Long id=1L;
		when(studentRepository.findById(id)).thenReturn(Optional.of(new Student(1L, "digvijay", "12", "12345")));
		//assertEquals(1, service.getUserbyAddress(address).size());
		Assertions.assertEquals(1,studentService.getStudentById(id).stream().count());
	}

	@Test
	public void deleteStudentTest(){
		Student student=new Student(1L,"digvijay","5","12345");
		studentService.deleteStudent(1L);
		verify(studentRepository,times(1)).deleteById(1L);
	}

}
