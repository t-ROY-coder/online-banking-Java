package com.abc.onlinebanking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.abc.onlinebanking.domain.UserTypeDetails;
import com.abc.onlinebanking.service.UserTypeService;

//creating RestController
@RestController
public class UserTypeController
{
    //autowired the UserRoleService class
    @Autowired
    UserTypeService userTypeService;

    //creating a get mapping that retrieves all the user type details from the database
    @GetMapping("/userType")
    private List<UserTypeDetails> getAllUserTypes()
    {
        return userTypeService.getAllUserTypes();
    }

    //creating a get mapping that retrieves the detail of a specific user type
    @GetMapping("/userType/{id}")
    private UserTypeDetails getUserType(@PathVariable("id") long id)
    {
        return userTypeService.getUserTypeById(id);
    }

    //creating a delete mapping that deletes a specific user type
    @DeleteMapping("/userType/{id}")
    private void deleteUserType(@PathVariable("id") long id)
    {
        userTypeService.delete(id);
    }

    //creating post mapping that post the user type detail in the database
    @PostMapping("/userType")
    private long saveUserType(@RequestBody UserTypeDetails userType)
    {
        userTypeService.saveOrUpdate(userType);
        return userType.getUserTypeId();
    }
}