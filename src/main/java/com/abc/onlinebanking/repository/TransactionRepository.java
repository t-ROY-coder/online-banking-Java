package com.abc.onlinebanking.repository;

import com.abc.onlinebanking.domain.TransactionDetails;
import org.springframework.data.repository.CrudRepository;
public interface TransactionRepository extends CrudRepository<TransactionDetails, Long>
{
}