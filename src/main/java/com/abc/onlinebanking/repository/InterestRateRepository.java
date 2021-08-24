package com.abc.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;
import com.abc.onlinebanking.domain.InterestRateDetails;
public interface InterestRateRepository extends CrudRepository<InterestRateDetails, String>
{
}