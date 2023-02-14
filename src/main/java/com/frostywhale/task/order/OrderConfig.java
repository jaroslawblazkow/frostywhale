package com.frostywhale.task.order;

import com.frostywhale.task.DomainEventPublisher;
import com.frostywhale.task.order.application.OrderService;
import com.frostywhale.task.order.infrastracture.OrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class OrderConfig {

    @Bean
    OrderService orderService(OrderRepository orderRepository, DomainEventPublisher domainEventPublisher) {
        return new OrderService(orderRepository, domainEventPublisher);
    }

}