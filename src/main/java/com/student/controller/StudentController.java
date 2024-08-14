package com.student.controller;

import com.student.Entity.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createStudent = studentService.createStudent(student);
        return new ResponseEntity<>(createStudent, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Student>> fetchAll(){
      List<Student> allStudent= studentService.getAllStudent();
     return ResponseEntity.ok(allStudent);

    }

    @DeleteMapping({"id"})
    public void deleteStudent(@PathVariable("id") long id){
        studentService.getStudentById(id);
    }
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") long id){
       Student studentUpdate= studentService.updateStudent(id,student);
       return ResponseEntity.ok(studentUpdate);
    }
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long id){
        Student studentById = studentService.getStudentById(id);
        return ResponseEntity.ok(studentById);
    }

}
