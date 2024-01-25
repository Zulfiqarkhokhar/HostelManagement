package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.Admin;
import com.HostelManagement.HostelManagement.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class AdminController {

    @Autowired
    private AdminRepo repo;

    @PostMapping("/admin")
    public Optional<Admin> getAdmin(@RequestBody Admin admin) {
//
        return repo.findByUsernameAndPassword(admin.getUsername(),admin.getPassword());
    }
}
