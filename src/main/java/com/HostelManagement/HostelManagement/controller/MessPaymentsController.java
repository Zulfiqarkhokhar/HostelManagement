package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.MessPayments;
import com.HostelManagement.HostelManagement.repository.MessPaymentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessPaymentsController {

    @Autowired
    private MessPaymentsRepo messPaymentsRepo;

    @PostMapping("/student/messPayments")
    public void addPayment(@RequestBody MessPayments payments){
        messPaymentsRepo.save(payments);
    }
}
