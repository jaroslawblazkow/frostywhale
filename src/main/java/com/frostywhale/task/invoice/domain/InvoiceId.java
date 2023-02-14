package com.frostywhale.task.invoice.domain;

import com.frostywhale.task.AggregateId;

import java.util.UUID;

public class InvoiceId implements AggregateId {
    private final UUID uuid;

    private InvoiceId(UUID uuid) {
        this.uuid = uuid;
    }

    public static InvoiceId of(UUID uuid) {
        return new InvoiceId(uuid);
    }
}
