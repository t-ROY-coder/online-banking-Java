package com.abc.onlinebanking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.abc.onlinebanking.domain.AccountDetails;
import com.abc.onlinebanking.service.AccountService;

//creating RestController
@RestController
public class AccountController
{
    //autowired the AccountService class
    @Autowired
    AccountService accountService;

    //creating a get mapping that retrieves all the acc details from the database
    @GetMapping("/account")
    private List<AccountDetails> getAllAccounts()
    {
        return accountService.getAllAccounts();
    }

    //creating a get mapping that retrieves the detail of a specific acc
    @GetMapping("/account/{id}")
    private AccountDetails getAccount(@PathVariable("id") String id)
    {
        return accountService.getAccountById(id);
    }

    //creating a delete mapping that deletes a specific acc
    @DeleteMapping("/account/{id}")
    private String deleteAccount(@PathVariable("id") String id)
    {
        accountService.delete(id);
        return id;
    }

    //creating post mapping that post the acc detail in the database
    @PostMapping("/account")
    private String saveAccount(@RequestBody AccountDetails acc)
    {
        accountService.saveOrUpdate(acc);
        return acc.getAccountNumber();
    }
}