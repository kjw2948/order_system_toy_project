package com.practice.domain.customer;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CustomerDto {
    private String name;

    private String phoneNumber;

    private String address;
}
