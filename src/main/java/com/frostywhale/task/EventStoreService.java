package com.frostywhale.task;

import java.util.List;

public class EventStoreService {
    private final EventStoreRepository eventRepository;

    public EventStoreService(EventStoreRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<EventStore> getEventsForAggregate(AggregateId aggregateId) {
        return eventRepository.findByAggregateId(aggregateId);
    }

    public void storeEvent(DomainEvent domainEvent) {
        EventStore eventStore = new EventStore(domainEvent.getAggregateId(), domainEvent.getClass().getName(), domainEvent.getPayload());
        eventRepository.save(eventStore);
    }
}