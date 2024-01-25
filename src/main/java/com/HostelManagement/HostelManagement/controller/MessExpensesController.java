package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.MessExpenses;
import com.HostelManagement.HostelManagement.repository.MessExpensesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MessExpensesController {

    @Autowired
    private MessExpensesRepo repo;

    @PostMapping("/messExpenses")
    public String addMessExpenses(@RequestBody MessExpenses messExpenses){

        int sum = 0;
        List<MessExpenses> expenses = repo.findAll();
        for(MessExpenses expense :expenses){
            sum += expense.getAmount();
        }
        messExpenses.setTotalExpenses(sum+messExpenses.getAmount());
//        System.out.println(messExpenses.getTotal());
        repo.save(messExpenses);
        return "messExpenses added";
    }

    @GetMapping("/getMessExpenses")
    public List<MessExpenses> getMessExpenses(){
        return repo.findAll();
    }

    @DeleteMapping("/deleteMessExpenses/{itemId}")
    public void deleteExtraExpenses(@PathVariable Long itemId){
        if(repo.existsById(itemId)) {
            repo.deleteById(itemId);
        }
    }
}
