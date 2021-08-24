package com.abc.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;
import com.abc.onlinebanking.domain.CustomerDetails;
public interface CustomerRepository extends CrudRepository<CustomerDetails, String>
{
}