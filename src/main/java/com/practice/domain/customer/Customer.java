package com.practice.domain.customer;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "customers")
@Getter
public class Customer {
    @Id
    private int customerId;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    @Column
    private String address;

    public Customer(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public static Customer newCustomer(CreateCustomer customer) {
        return new Customer(customer.getName(), customer.getPhoneNumber(), customer.getAddress());
    }
}
