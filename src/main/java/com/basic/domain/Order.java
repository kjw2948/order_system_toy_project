package com.basic.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Table(name = "orders")
public class Order {
    @Id
    private int orderId;

    @Column
    private int customerId;

    @Column
    private Timestamp orderAt;

    @MappedCollection(idColumn = "order_item_id", keyColumn = "order_id")
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(int customerId, List<OrderItem> orderItems) {
        this.customerId = customerId;
        this.orderAt = Timestamp.valueOf(LocalDateTime.now());
        this.orderItems = orderItems;
    }

    public static Order newOrder(CreateOrder createOrder) {
        ArrayList<OrderItem> items = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : createOrder.getQuantityByProduct().entrySet()) {
            items.add(new OrderItem(entry.getKey(), entry.getValue()));
        }

        return new Order(createOrder.getCustomerId(), items);
    }

}
