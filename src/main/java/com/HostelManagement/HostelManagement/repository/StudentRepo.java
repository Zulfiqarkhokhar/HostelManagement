package com.HostelManagement.HostelManagement.repository;

import com.HostelManagement.HostelManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    public Optional<Student> findByStudentId(String studentId);

}
