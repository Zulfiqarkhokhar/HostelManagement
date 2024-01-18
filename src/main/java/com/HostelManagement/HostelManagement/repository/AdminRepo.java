package com.HostelManagement.HostelManagement.repository;

import com.HostelManagement.HostelManagement.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {
    public Optional<Admin> findByUsernameAndPassword(String username,String password);
}
