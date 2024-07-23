package com.practice.domain.customer;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateCustomer {
    private String name;

    private String phoneNumber;

    private String address;
}
