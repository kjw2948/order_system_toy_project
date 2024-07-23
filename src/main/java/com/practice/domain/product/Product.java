package com.practice.domain.product;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table(name = "products")
public class Product {
    @Id
    private int productId;

    @Column
    private int quantity;

    @Column
    private int price;
}
