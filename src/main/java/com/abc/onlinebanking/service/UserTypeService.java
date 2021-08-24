package com.abc.onlinebanking.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.onlinebanking.domain.UserTypeDetails;
import com.abc.onlinebanking.repository.UserTypeRepository;
@Service
public class UserTypeService
{
    @Autowired
    UserTypeRepository userTypeRepository;

    //getting all records
    public List<UserTypeDetails> getAllUserTypes()
    {
        List<UserTypeDetails> userTypes = new ArrayList<>();
        userTypeRepository.findAll().forEach(userTypes::add);
        return userTypes;
    }

    //getting a specific record
    public UserTypeDetails getUserTypeById(long id)
    {
        return userTypeRepository.findById(id).get();
    }

    //saving data
    public void saveOrUpdate(UserTypeDetails customer)
    {
        userTypeRepository.save(customer);
    }

    //deleting a specific record
    public void delete(long id)
    {
        userTypeRepository.deleteById(id);
    }
}