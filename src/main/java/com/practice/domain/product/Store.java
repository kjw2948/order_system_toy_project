package com.practice.domain.product;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.ArrayList;
import java.util.List;

@Getter
@Table(name = "store")
public class Store {
    @Id
    private int storeId;

    @Column
    private String address;

    @Column
    private String openAt;

    @Column
    private String closeAt;


}
