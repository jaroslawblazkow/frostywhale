package com.frostywhale.task.order.application;

import com.frostywhale.task.order.domain.OrderId;

public record GetOrderQuery(OrderId orderId) {
}
