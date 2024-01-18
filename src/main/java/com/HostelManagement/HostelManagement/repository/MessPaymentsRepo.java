package com.HostelManagement.HostelManagement.repository;

import com.HostelManagement.HostelManagement.entity.MessPayments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessPaymentsRepo extends JpaRepository<MessPayments,Long> {
}
