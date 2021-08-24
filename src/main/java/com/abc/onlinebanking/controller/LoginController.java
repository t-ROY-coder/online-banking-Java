package com.abc.onlinebanking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.abc.onlinebanking.domain.LoginDetails;
import com.abc.onlinebanking.service.LoginService;

//creating RestController
@RestController
public class LoginController
{
    //autowired the LoginService class
    @Autowired
    LoginService loginService;

    //creating a get mapping that retrieves all the logins detail from the database
    @GetMapping("/login")
    private List<LoginDetails> getAllLogins()
    {
        return loginService.getAllLogins();
    }

    //creating a get mapping that retrieves the detail of a specific login
    @GetMapping("/login/{id}")
    private LoginDetails getLogin(@PathVariable("id") String id)
    {
        return loginService.getLoginById(id);
    }

    //creating a delete mapping that deletes a specific login
    @DeleteMapping("/login/{id}")
    private void deleteLogin(@PathVariable("id") String id)
    {
        loginService.delete(id);
    }

    //creating post mapping that post the login detail in the database
    @PostMapping("/login")
    private String saveLogin(@RequestBody LoginDetails login)
    {
        loginService.saveOrUpdate(login);
        return login.getLoginId();
    }
}