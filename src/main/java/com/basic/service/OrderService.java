package com.basic.service;

import com.basic.domain.CreateOrder;
import com.basic.domain.Order;
import com.basic.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public void newOrder(CreateOrder createOrder) {
        Order entity = Order.newOrder(createOrder);
        orderRepository.save(entity);
    }
}

