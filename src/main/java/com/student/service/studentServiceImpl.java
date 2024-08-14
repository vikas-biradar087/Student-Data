package com.student.service;

import com.student.Entity.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentServiceImpl implements StudentService {
    @Autowired

    private StudentRepository studentRepo;


    @Override
    public List<Student> getAllStudent() {

     return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(long id) {


        Optional<Student> byId = studentRepo.findById(id);
        Student student=byId.get();
        return student;

    }

    @Override
    public Student createStudent(Student student) {
       return studentRepo.save(student);

    }

    @Override
    public Student updateStudent(long id, Student student) {
        Optional<Student> byId = studentRepo.findById(id);
        Student updateStudent = byId.get();
        updateStudent.setFirstName(student.getFirstName());
        updateStudent.setLastName(student.getLastName());
        updateStudent.setEmail(student.getEmail());
        updateStudent.setMobile(student.getMobile());
        return studentRepo.save(updateStudent);

    }

    @Override
    public void deleteStudent(long id) {
        studentRepo.deleteById(id);


    }
}
