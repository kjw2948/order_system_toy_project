package com.basic.repository;

import com.basic.domain.Customer;
import com.basic.domain.CustomerDto;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
