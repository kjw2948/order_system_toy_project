package com.practice.repository;

import com.practice.domain.order.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface OrderRepository extends CrudRepository<Order, Integer> {
}
