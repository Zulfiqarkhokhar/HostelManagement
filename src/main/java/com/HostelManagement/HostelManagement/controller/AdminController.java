package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.Admin;
import com.HostelManagement.HostelManagement.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3001")
public class AdminController {

    @Autowired
    private AdminRepo repo;

    @PostMapping("/admin")
    public String getAdmin(@RequestBody Admin admin) {
//
        repo.findByUsernameAndPassword(admin.getUsername(),admin.getPassword());
        return "Admin fount";
    }
}
