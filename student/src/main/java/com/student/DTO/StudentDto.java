package com.student.DTO;

public class StudentDto {

    private Long studentId;
    private   String studentName;
    private String studentStandard;
    private String contactNo;

    public StudentDto() {

    }

    public StudentDto(Long studentId, String studentName, String studentStandard, String contactNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentStandard = studentStandard;
        this.contactNo = contactNo;
    }

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
}
