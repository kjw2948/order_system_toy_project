package com.practice.domain.order;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.HashMap;
import java.util.Map;

@Table(name = "Order_Item")
@Getter
public class OrderItem {
    @Id
    private int orderItemId;

    @Column
    private int productId;

    @Column
    private int stockQuantity;

    public OrderItem(int productId, int stockQuantity) {
        this.productId = productId;
        this.stockQuantity = stockQuantity;
    }
}
