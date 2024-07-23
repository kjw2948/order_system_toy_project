package com.practice.domain.product;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table(name = "store_products")
public class StoreProduct {
    @Id
    private int storeProductId;

    @Column
    private int storeId;

    @Column
    private int productId;

    @Column
    private int stockQuantity;


    public void adjustStockQuantity(int orderQuantity) {
        if (stockQuantity < orderQuantity) {
            throw new RuntimeException("재고가 충분하지 않습니다");
        }
        this.stockQuantity -= orderQuantity;
    }
}
