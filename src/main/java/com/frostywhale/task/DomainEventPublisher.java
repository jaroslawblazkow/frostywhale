package com.frostywhale.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class DomainEventPublisher {
    private final EventStoreService eventStoreService;
    private final KafkaTemplate<String, DomainEvent> kafkaTemplate;
    private final String topic;

    public DomainEventPublisher(EventStoreService eventStoreService, KafkaTemplate<String, DomainEvent> kafkaTemplate, String topic) {
        this.eventStoreService = eventStoreService;
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    public void publish(DomainEvent domainEvent) {
        eventStoreService.storeEvent(domainEvent);
        kafkaTemplate.send(topic, domainEvent);
    }
}