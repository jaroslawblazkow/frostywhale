package com.frostywhale.task.order.domain;

import com.frostywhale.task.customer.domain.CustomerId;
import com.frostywhale.task.order.application.CreateOrderCommand;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Order {
    private OrderId orderId;
    private CustomerId customerId;
    private List<OrderItem> orderItems;
    private OrderStatus status;
    private Instant paidAt;

    public OrderId getOrderId() {
        return orderId;
    }

    public static Order create(CreateOrderCommand createOrderCommand) {
        Order order = new Order();
        order.orderId = OrderId.of(UUID.randomUUID());
        order.customerId = createOrderCommand.customerId();
        order.orderItems = createOrderCommand.orderItems();
        order.status = OrderStatus.PENDING;
        return order;
    }

    public void pay() {
        if (this.status != OrderStatus.PENDING) {
            throw new IllegalStateException("Order must be in PENDING status to be paid");
        }

        this.status = OrderStatus.PAID;
        this.paidAt = Instant.now();
    }
}
