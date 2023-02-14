package com.frostywhale.task.customer.domain;

import com.frostywhale.task.AggregateId;

import java.util.UUID;

public class CustomerId implements AggregateId {
    private final UUID uuid;

    private CustomerId(UUID uuid) {
        this.uuid = uuid;
    }

    public static CustomerId of(UUID uuid) {
        return new CustomerId(uuid);
    }

    @Override
    public String toString() {
        return "CustomerId{" +
                "uuid=" + uuid +
                '}';
    }
}
