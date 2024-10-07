package com.colak.springtutorial.ordermodule.module;

import com.colak.springtutorial.ordermodule.jpa.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;
import org.springframework.modulith.NamedInterface;

@Configuration
@NamedInterface("OrderModule")
@RequiredArgsConstructor
public class OrderModule {

    private final ApplicationEventPublisher eventPublisher;

    public void createOrder(Order order) {
        // Business logic for creating an order
        eventPublisher.publishEvent(new OrderCreatedEvent(order.getId()));
    }
}
