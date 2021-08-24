package com.abc.onlinebanking.repository;

import com.abc.onlinebanking.domain.UserTypeDetails;
import org.springframework.data.repository.CrudRepository;
public interface UserTypeRepository extends CrudRepository<UserTypeDetails, Long>
{
}