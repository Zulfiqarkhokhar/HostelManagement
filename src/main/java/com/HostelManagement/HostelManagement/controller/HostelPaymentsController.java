package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.HostelPayments;
import com.HostelManagement.HostelManagement.entity.Student;
import com.HostelManagement.HostelManagement.repository.HostelPaymentsRepo;
import com.HostelManagement.HostelManagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class HostelPaymentsController {

    @Autowired
    private HostelPaymentsRepo hostelPaymentsRepo;

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/hostel/hostelPayments/{id}")
    public Student addPayments(@RequestBody HostelPayments payments,@PathVariable Long id){
        Optional<Student> student = studentRepo.findById(id);
        Student newStudent = student.get();
        newStudent.setHostelPayments(payments);
        studentRepo.save(newStudent);
        return newStudent;
    }

    @GetMapping("/hostel/hostelPayments/all")
    public List<HostelPayments> getAllPayments(){
        return hostelPaymentsRepo.findAll();
    }

}
