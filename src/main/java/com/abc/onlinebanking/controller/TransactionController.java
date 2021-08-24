package com.abc.onlinebanking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.abc.onlinebanking.domain.TransactionDetails;
import com.abc.onlinebanking.service.TransactionService;

//creating RestController
@RestController
public class TransactionController
{
    //autowired the UserRoleService class
    @Autowired
    TransactionService transactionService;

    //creating a get mapping that retrieves all the transaction details from the database
    @GetMapping("/transaction")
    private List<TransactionDetails> getAllTransactions()
    {
        return transactionService.getAllTransactions();
    }

    //creating a get mapping that retrieves the detail of a specific transaction
    @GetMapping("/transaction/{id}")
    private TransactionDetails getTransaction(@PathVariable("id") long id)
    {
        return transactionService.getTransactionById(id);
    }

    //creating a delete mapping that deletes a specific transaction
    @DeleteMapping("/transaction/{id}")
    private void deleteTransaction(@PathVariable("id") long id)
    {
        transactionService.delete(id);
    }

    //creating post mapping that post the transaction detail in the database
    @PostMapping("/transaction")
    private long saveUserRole(@RequestBody TransactionDetails transaction)
    {
        transactionService.saveOrUpdate(transaction);
        return transaction.getTransactionId();
    }
}