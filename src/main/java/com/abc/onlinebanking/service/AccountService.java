package com.abc.onlinebanking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.onlinebanking.domain.AccountDetails;
import com.abc.onlinebanking.repository.AccountRepository;
@Service
public class AccountService
{
    @Autowired
    AccountRepository accountRepository;

    //getting all records
    public List<AccountDetails> getAllAccounts()
    {
        List<AccountDetails> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }

    //getting a specific record
    public AccountDetails getAccountById(String id)
    {
        return accountRepository.findById(id).get();
    }

    //saving data
    public void saveOrUpdate(AccountDetails account)
    {
        accountRepository.save(account);
    }

    //deleting a specific record
    public void delete(String id)
    {
        accountRepository.deleteById(id);
    }
}