package com.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
//@Data
//z@RequiredArgsConstructor
//@AllArgsConstructor
//@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long studentId;
    private   String studentName;
    private String studentStandard;
    private String contactNo;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentStandard() {
        return studentStandard;
    }

    public void setStudentStandard(String studentStandard) {
        this.studentStandard = studentStandard;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Student(Long studentId, String studentName, String studentStandard, String contactNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentStandard = studentStandard;
        this.contactNo = contactNo;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentStandard='" + studentStandard + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
