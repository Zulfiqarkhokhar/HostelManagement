package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.Student;
import com.HostelManagement.HostelManagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController("/api")
@CrossOrigin("http://localhost:3001")
public class StudentController {

    @Autowired
    private StudentRepo repo;

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        repo.save(student);
        return "Student added successfully";
    }

    @GetMapping("/allStudents")
    public ArrayList<Student> getAllStudents(){
        return (ArrayList<Student>) repo.findAll();
    }

    @GetMapping("/student/{studentId}")
    public Optional<Student> getStudent(@PathVariable String studentId){
        return repo.findByStudentId(studentId);
    }

}
