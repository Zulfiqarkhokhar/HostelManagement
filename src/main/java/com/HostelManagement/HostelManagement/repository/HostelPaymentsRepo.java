package com.HostelManagement.HostelManagement.repository;

import com.HostelManagement.HostelManagement.entity.HostelPayments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelPaymentsRepo extends JpaRepository<HostelPayments, Long> {
}
