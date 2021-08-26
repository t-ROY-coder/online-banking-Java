package com.abc.onlinebanking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.onlinebanking.domain.CustomerDetails;
import com.abc.onlinebanking.repository.CustomerRepository;
@Service
public class CustomerService
{
    @Autowired
    CustomerRepository customerRepository;

    //getting all login records
    public List<CustomerDetails> getAllCustomers()
    {
        List<CustomerDetails> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    //getting a specific record
    public CustomerDetails getCustomerById(String id)
    {
        return customerRepository.findById(id).get();
    }

    //saving data
    public void saveOrUpdate(CustomerDetails customer)
    {
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setName(customer.getName());
        customerDetails.setAddress(customer.getAddress());
        customerDetails.setCity(customer.getCity());
        customerDetails.setPhone(customer.getPhone());

        customerDetails.setAccounts(customer.getAccounts());
        customerRepository.save(customerDetails);
    }

    //deleting a specific record
    public void delete(String id)
    {
        customerRepository.deleteById(id);
    }


}