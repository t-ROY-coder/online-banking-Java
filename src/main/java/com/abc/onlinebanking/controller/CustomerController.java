package com.abc.onlinebanking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.abc.onlinebanking.domain.CustomerDetails;
import com.abc.onlinebanking.service.CustomerService;

//creating RestController
@RestController
public class CustomerController
{
    //autowired the CustomerService class
    @Autowired
    CustomerService customerService;

    //creating a get mapping that retrieves all the customers detail from the database
    @GetMapping("/customer")
    private List<CustomerDetails> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    //creating a get mapping that retrieves the detail of a specific customer
    @GetMapping("/customer/{id}")
    private CustomerDetails getCustomer(@PathVariable("id") String id)
    {
        return customerService.getCustomerById(id);
    }

    //creating a delete mapping that deletes a specific customer
    @DeleteMapping("/customer/{id}")
    private String deleteCustomer(@PathVariable("id") String id)
    {
        customerService.delete(id);
        return id;
    }

    //creating post mapping that post the customer detail in the database
    @PostMapping("/customer")
    private String saveCustomer(@RequestBody CustomerDetails customer)
    {
        customerService.saveOrUpdate(customer);
        return customer.getCustomerId();
    }
}