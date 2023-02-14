package com.frostywhale.task;

import java.util.UUID;

public class EventStore {
    private UUID id;
    private AggregateId aggregateId;
    private String eventType;
    private String payload;

    public EventStore(AggregateId aggregateId, String eventType, String payload) {
        this.id = UUID.randomUUID();
        this.aggregateId = aggregateId;
        this.eventType = eventType;
        this.payload = payload;
    }
}