package com.abc.onlinebanking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.abc.onlinebanking.domain.InterestRateDetails;
import com.abc.onlinebanking.service.InterestRateService;

//creating RestController
@RestController
public class InterestRateController
{
    //autowired the InterestRateService class
    @Autowired
    InterestRateService interestRateService;

    //creating a get mapping that retrieves all the interest rate details from the database
    @GetMapping("/interestRate")
    private List<InterestRateDetails> getAllInterestRates()
    {
        return interestRateService.getAllInterestRates();
    }

    //creating a get mapping that retrieves the detail of a specific interest rate
    @GetMapping("/interestRate/{id}")
    private InterestRateDetails getInterestRate(@PathVariable("id") String id)
    {
        return interestRateService.getInterestRateById(id);
    }

    //creating a delete mapping that deletes a specific interest rate
    @DeleteMapping("/interestRate/{id}")
    private void deleteLogin(@PathVariable("id") String id)
    {
        interestRateService.delete(id);
    }

    //creating post mapping that post the interest rate detail in the database
    @PostMapping("/interestRate")
    private String saveLogin(@RequestBody InterestRateDetails interestRate)
    {
        interestRateService.saveOrUpdate(interestRate);
        return interestRate.getAccountType();
    }
}