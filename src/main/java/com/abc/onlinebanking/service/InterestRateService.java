package com.abc.onlinebanking.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.onlinebanking.domain.InterestRateDetails;
import com.abc.onlinebanking.repository.InterestRateRepository;
@Service
public class InterestRateService
{
    @Autowired
    InterestRateRepository interestRateRepository;

    //getting all records
    public List<InterestRateDetails> getAllInterestRates()
    {
        List<InterestRateDetails> rates = new ArrayList<>();
        interestRateRepository.findAll().forEach(rates::add);
        return rates;
    }

    //getting a specific record
    public InterestRateDetails getInterestRateById(String id)
    {
        return interestRateRepository.findById(id).get();
    }

    //saving data
    public void saveOrUpdate(InterestRateDetails customer)
    {
        interestRateRepository.save(customer);
    }

    //deleting a specific record
    public void delete(String id)
    {
        interestRateRepository.deleteById(id);
    }
}