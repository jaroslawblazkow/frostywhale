package com.frostywhale.task.order.application;

import com.frostywhale.task.customer.domain.CustomerId;
import com.frostywhale.task.order.domain.OrderItem;

import java.util.List;

public record CreateOrderCommand(List<OrderItem> orderItems, CustomerId customerId) {
}
