package com.abc.onlinebanking.repository;

import com.abc.onlinebanking.domain.UserRoleDetails;
import org.springframework.data.repository.CrudRepository;
public interface UserRoleRepository extends CrudRepository<UserRoleDetails, Long>
{
}