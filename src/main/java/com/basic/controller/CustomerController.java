package com.basic.controller;

import com.basic.domain.CreateCustomer;
import com.basic.domain.Customer;
import com.basic.domain.CustomerDto;
import com.basic.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/api/v1/customers")
    public Response<CustomerDto> createNewCustomer(
            @RequestParam String name,
            @RequestParam String address,
            @RequestParam String phoneNumber
    ) {
        return Response.success(customerService.newCustomer(
                CreateCustomer.builder()
                        .address(address)
                        .name(name)
                        .phoneNumber(phoneNumber)
                        .build()));
    }
}
