package com.practice.service;

import com.practice.domain.customer.CreateCustomer;
import com.practice.domain.customer.Customer;
import com.practice.domain.customer.CustomerDto;
import com.practice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerDto createCustomer(CreateCustomer customer) {
        Customer entity = Customer.newCustomer(customer);
        Customer save = customerRepository.save(entity);
        return CustomerDto.builder()
                .name(save.getName())
                .phoneNumber(save.getPhoneNumber())
                .address(save.getAddress())
                .build();
    }
}
