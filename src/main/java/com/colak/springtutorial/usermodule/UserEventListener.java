package com.colak.springtutorial.usermodule;

import com.colak.springtutorial.ordermodule.module.OrderCreatedEvent;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener {

    @ApplicationModuleListener
    public void onOrderCreated(OrderCreatedEvent event) {
        System.out.println("UserModule received OrderCreatedEvent for order ID: " + event.getOrderId());
        // Additional business logic to update user activity
    }
}
