package com.abc.onlinebanking.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.onlinebanking.domain.UserRoleDetails;
import com.abc.onlinebanking.repository.UserRoleRepository;
@Service
public class UserRoleService
{
    @Autowired
    UserRoleRepository userRoleRepository;

    //getting all records
    public List<UserRoleDetails> getAllUserRoles()
    {
        List<UserRoleDetails> userRoles = new ArrayList<>();
        userRoleRepository.findAll().forEach(userRoles::add);
        return userRoles;
    }

    //getting a specific record
    public UserRoleDetails getUserRoleById(long id)
    {
        return userRoleRepository.findById(id).get();
    }

    //saving data
    public void saveOrUpdate(UserRoleDetails userRole)
    {
        userRoleRepository.save(userRole);
    }

    //deleting a specific record
    public void delete(long id)
    {
        userRoleRepository.deleteById(id);
    }
}