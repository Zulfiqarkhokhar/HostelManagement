package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.ExtraExpenses;
import com.HostelManagement.HostelManagement.entity.MessExpenses;
import com.HostelManagement.HostelManagement.repository.ExtraExpensesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ExtraExpensesController {

    @Autowired
    private ExtraExpensesRepo repo;

    @PostMapping("/extraExpenses")
    public String addExtraExpenses(@RequestBody ExtraExpenses extraExpenses) {
        int sum = 0;
        List<ExtraExpenses> expenses = repo.findAll();
        for(ExtraExpenses expense :expenses){
            sum += expense.getAmount();
        }
        extraExpenses.setTotalExpenses(sum+extraExpenses.getAmount());
        repo.save(extraExpenses);
        return "extra expenses added";
    }

    @GetMapping("/getExtraExpenses")
    public List<ExtraExpenses> getExtraExpenses(){
        return repo.findAll();
    }

    @DeleteMapping("/deleteExtraExpenses/{itemId}")
    public void deleteExtraExpenses(@PathVariable Long itemId){
        if(repo.existsById(itemId)) {
            repo.deleteById(itemId);
        }
    }
}
