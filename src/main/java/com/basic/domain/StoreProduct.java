package com.basic.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "store_products")
@Getter
public class StoreProduct {
    @Id
    private int storeProductId;

    @Column
    private String storeId;

    @Column
    private String productId;

    @Column
    private String stockQuantity;
}
