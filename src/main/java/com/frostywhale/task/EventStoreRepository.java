package com.frostywhale.task;

import java.util.List;

public interface EventStoreRepository {
    List<EventStore> findByAggregateId(AggregateId aggregateId);

    EventStore save(EventStore eventStore);
}
