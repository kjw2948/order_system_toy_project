package com.practice.service;

import com.practice.domain.order.CreateOrder;
import com.practice.domain.order.Order;
import com.practice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

}
