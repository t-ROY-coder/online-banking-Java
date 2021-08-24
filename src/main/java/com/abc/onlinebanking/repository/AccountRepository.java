package com.abc.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;
import com.abc.onlinebanking.domain.AccountDetails;
public interface AccountRepository extends CrudRepository<AccountDetails, String>
{
}