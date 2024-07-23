package com.practice.domain.order;


import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Builder
@Getter
public class CreateOrder {
    private String customerId;

    private Timestamp orderAt;

    private Map<Integer, Integer> items = new HashMap<>();
}
