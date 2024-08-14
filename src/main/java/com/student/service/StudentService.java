package com.student.service;

import com.student.Entity.Student;

import java.util.List;

public interface StudentService {


    public List<Student> getAllStudent();
    public Student getStudentById(long id);
    public Student createStudent(Student student);
    public Student updateStudent(long id,Student student);
    public void deleteStudent(long id);

}
