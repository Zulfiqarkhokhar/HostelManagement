package com.HostelManagement.HostelManagement.repository;

import com.HostelManagement.HostelManagement.entity.ExtraExpenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraExpensesRepo extends JpaRepository<ExtraExpenses,Long> {
}
