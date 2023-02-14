package com.frostywhale.task;

import java.time.Instant;

public abstract class DomainEvent {
    private final Instant occurredOn = Instant.now();
    private final AggregateId aggregateId;

    protected DomainEvent(AggregateId aggregateId) {
        this.aggregateId = aggregateId;
    }

    protected abstract String getPayload();

    public Instant getOccurredOn() {
        return occurredOn;
    }

    public AggregateId getAggregateId() {
        return aggregateId;
    }
}
