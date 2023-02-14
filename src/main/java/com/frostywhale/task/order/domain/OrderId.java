package com.frostywhale.task.order.domain;

import com.frostywhale.task.AggregateId;

import java.util.UUID;

public class OrderId implements AggregateId {
    private final UUID uuid;

    private OrderId(UUID uuid) {
        this.uuid = uuid;
    }

    public static OrderId of(UUID uuid) {
        return new OrderId(uuid);
    }
}
