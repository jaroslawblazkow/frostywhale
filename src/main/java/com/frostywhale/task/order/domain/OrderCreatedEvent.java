package com.frostywhale.task.order.domain;

import com.frostywhale.task.DomainEvent;

public class OrderCreatedEvent extends DomainEvent {
    public OrderCreatedEvent(Order order) {
        super(order.getOrderId());
    }

    @Override
    protected String getPayload() {
        return null;
    }
}
