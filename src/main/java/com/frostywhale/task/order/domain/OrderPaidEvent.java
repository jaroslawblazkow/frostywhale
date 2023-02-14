package com.frostywhale.task.order.domain;

import com.frostywhale.task.DomainEvent;
import com.frostywhale.task.customer.domain.CustomerId;

import java.util.List;
import java.util.stream.Collectors;

public class OrderPaidEvent extends DomainEvent {

    private List<OrderItem> orderItems;
    private CustomerId customerId;

    public OrderPaidEvent(OrderId orderId) {
        super(orderId);
    }

    @Override
    protected String getPayload() {
        return orderItems.stream().map(OrderItem::toString).collect(Collectors.joining()) + customerId.toString();
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }
}