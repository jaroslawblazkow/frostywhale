package com.frostywhale.task.order.application;

import com.frostywhale.task.DomainEventPublisher;
import com.frostywhale.task.order.domain.Order;
import com.frostywhale.task.order.domain.OrderCreatedEvent;
import com.frostywhale.task.order.domain.OrderPaidEvent;
import com.frostywhale.task.order.infrastracture.OrderRepository;

public class OrderService {

    private final OrderRepository orderRepository;
    private final DomainEventPublisher domainEventPublisher;

    public OrderService(OrderRepository orderRepository, DomainEventPublisher domainEventPublisher) {
        this.orderRepository = orderRepository;
        this.domainEventPublisher = domainEventPublisher;
    }

    public Order payOrder(PayOrderCommand command) {
        Order order = orderRepository.findById(command.orderId());
        order.pay();
        orderRepository.save(order);
        domainEventPublisher.publish(new OrderPaidEvent(command.orderId()));
        return order;
    }

    public Order createOrder(CreateOrderCommand command) {
        Order order = Order.create(command);
        orderRepository.save(order);
        domainEventPublisher.publish(new OrderCreatedEvent(order));
        return order;
    }

    public Order getOrder(GetOrderQuery query) {
        return orderRepository.findById(query.orderId());
    }
}
