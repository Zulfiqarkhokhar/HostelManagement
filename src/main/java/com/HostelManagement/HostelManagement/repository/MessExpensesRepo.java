package com.HostelManagement.HostelManagement.repository;

import com.HostelManagement.HostelManagement.entity.MessExpenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessExpensesRepo extends JpaRepository<MessExpenses,Long> {
}
