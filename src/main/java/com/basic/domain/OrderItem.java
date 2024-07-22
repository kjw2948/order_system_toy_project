package com.basic.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "order_items")
@Getter
public class OrderItem {
    @Id
    private int orderItemId;

    @Column
    private int productId;

    @Column
    private int orderQuantity;

    public OrderItem(Integer productId, Integer orderQuantity) {
        this.productId = productId;
        this.orderQuantity = orderQuantity;
    }
}
