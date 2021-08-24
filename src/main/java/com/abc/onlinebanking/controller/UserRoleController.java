package com.abc.onlinebanking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.abc.onlinebanking.domain.UserRoleDetails;
import com.abc.onlinebanking.service.UserRoleService;

//creating RestController
@RestController
public class UserRoleController
{
    //autowired the UserRoleService class
    @Autowired
    UserRoleService userRoleService;

    //creating a get mapping that retrieves all the user role details from the database
    @GetMapping("/userRole")
    private List<UserRoleDetails> getAllUserRoles()
    {
        return userRoleService.getAllUserRoles();
    }

    //creating a get mapping that retrieves the detail of a specific user role
    @GetMapping("/userRole/{id}")
    private UserRoleDetails getUserRole(@PathVariable("id") long id)
    {
        return userRoleService.getUserRoleById(id);
    }

    //creating a delete mapping that deletes a specific user role
    @DeleteMapping("/userRole/{id}")
    private void deleteUserRole(@PathVariable("id") long id)
    {
        userRoleService.delete(id);
    }

    //creating post mapping that post the user role detail in the database
    @PostMapping("/userRole")
    private long saveUserRole(@RequestBody UserRoleDetails userRole)
    {
        userRoleService.saveOrUpdate(userRole);
        return userRole.getUserRoleId();
    }
}