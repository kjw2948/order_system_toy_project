package com.practice.domain.order;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Table(name = "orders")
@Getter
public class Order {
    @Id
    private int orderId;

    @Column
    private String customerId;

    @Column
    private Timestamp orderAt;

    @MappedCollection(idColumn = "order_id", keyColumn = "order_item_id")
    private Set<OrderItem> orderItems = new HashSet<>();

    public Order(String customerId, Set<OrderItem> orderItems) {
        this.customerId = customerId;
        this.orderAt = Timestamp.valueOf(LocalDateTime.now());
        this.orderItems = orderItems;
    }

    public static Order newOrder(CreateOrder order) {
        Set<OrderItem> orderItems = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : order.getItems().entrySet()) {
            orderItems.add(new OrderItem(entry.getKey(), entry.getValue()));
        }
        return new Order(order.getCustomerId(), orderItems);
    }
}
