package com.basic.controller;

import com.basic.domain.CreateOrder;
import com.basic.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/api/v1/orders")
    public Response<Void> newOrder() {
        HashMap<Integer, Integer> orderMap = new HashMap<>();
        orderMap.put(1, 5);
        orderMap.put(2, 10);
        orderService.newOrder(CreateOrder.builder()
                        .customerId(1)
                        .quantityByProduct(orderMap)
                .build());
        return Response.success(null);
    }
}
