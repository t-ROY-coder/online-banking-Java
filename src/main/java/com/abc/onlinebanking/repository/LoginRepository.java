package com.abc.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;
import com.abc.onlinebanking.domain.LoginDetails;
public interface LoginRepository extends CrudRepository<LoginDetails, String>
{
}