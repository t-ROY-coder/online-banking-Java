package com.abc.onlinebanking.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.onlinebanking.domain.LoginDetails;
import com.abc.onlinebanking.repository.LoginRepository;
@Service
public class LoginService
{
    @Autowired
    LoginRepository loginRepository;

    //getting all login records
    public List<LoginDetails> getAllLogins()
    {
        List<LoginDetails> logins = new ArrayList<>();
        loginRepository.findAll().forEach(logins::add);
        return logins;
    }

    //getting a specific record
    public LoginDetails getLoginById(String id)
    {
        return loginRepository.findById(id).get();
    }

    //saving data
    public void saveOrUpdate(LoginDetails customer)
    {
        loginRepository.save(customer);
    }

    //deleting a specific record
    public void delete(String id)
    {
        loginRepository.deleteById(id);
    }
}