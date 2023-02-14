package com.frostywhale.task.order.application;

import com.frostywhale.task.order.domain.OrderId;

record PayOrderCommand(OrderId orderId) {
}
