package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.MessPayments;
import com.HostelManagement.HostelManagement.entity.Student;
import com.HostelManagement.HostelManagement.repository.MessPaymentsRepo;
import com.HostelManagement.HostelManagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class MessPaymentsController {

    @Autowired
    private MessPaymentsRepo messPaymentsRepo;

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/mess/messPayments/{id}")
    public Student addPayment(@RequestBody MessPayments payments,@PathVariable Long id){
        Optional<Student> student = studentRepo.findById(id);

        Student newStudent = student.get();

        newStudent.setMessPayments(payments);
        studentRepo.save(newStudent);
        return newStudent;
    }

    @GetMapping("/student/messPayments/all")
    public List<MessPayments> getMessPayments(){
        return messPaymentsRepo.findAll();
    }

}
