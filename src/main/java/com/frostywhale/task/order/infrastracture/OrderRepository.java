package com.frostywhale.task.order.infrastracture;

import com.frostywhale.task.order.domain.Order;
import com.frostywhale.task.order.domain.OrderId;

public interface OrderRepository {
    Order findById(OrderId orderId);

    Order save(Order order);
}
