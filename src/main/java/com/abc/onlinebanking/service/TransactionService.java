package com.abc.onlinebanking.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.onlinebanking.domain.TransactionDetails;
import com.abc.onlinebanking.repository.TransactionRepository;
@Service
public class TransactionService
{
    @Autowired
    TransactionRepository transactionRepository;

    //getting all records
    public List<TransactionDetails> getAllTransactions()
    {
        List<TransactionDetails> transactions = new ArrayList<>();
        transactionRepository.findAll().forEach(transactions::add);
        return transactions;
    }

    //getting a specific record
    public TransactionDetails getTransactionById(long id)
    {
        return transactionRepository.findById(id).get();
    }

    //saving data
    public void saveOrUpdate(TransactionDetails transaction)
    {
        transactionRepository.save(transaction);
    }

    //deleting a specific record
    public void delete(long id)
    {
        transactionRepository.deleteById(id);
    }
}