package com.colak.springtutorial.ordermodule.service;

import com.colak.springtutorial.ordermodule.jpa.Order;
import com.colak.springtutorial.ordermodule.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
