package com.frostywhale.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
class DomainEventConfig {

    @Bean
    EventStoreService eventStoreService(EventStoreRepository eventStoreRepository) {
        return new EventStoreService(eventStoreRepository);
    }

    @Bean
    DomainEventPublisher domainEventPublisher(EventStoreService eventStoreService, KafkaTemplate<String, DomainEvent> kafkaTemplate, @Value("${kafka.topic}") String topic) {
        return new DomainEventPublisher(eventStoreService, kafkaTemplate, topic);
    }

}