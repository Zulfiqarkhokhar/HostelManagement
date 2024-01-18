package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.HostelPayments;
import com.HostelManagement.HostelManagement.repository.HostelPaymentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
@CrossOrigin("http://localhost:3001")
public class HostelPaymentsController {

    @Autowired
    private HostelPaymentsRepo hostelPaymentsRepo;

    @PostMapping("/student/hostelPayments")
    public void AddPayments(@RequestBody HostelPayments payments){
        hostelPaymentsRepo.save(payments);
    }

}
