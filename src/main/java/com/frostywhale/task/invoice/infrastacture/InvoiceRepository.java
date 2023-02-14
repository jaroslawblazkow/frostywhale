package com.frostywhale.task.invoice.infrastacture;

import com.frostywhale.task.invoice.domain.Invoice;

public interface InvoiceRepository {
    Invoice save(Invoice invoice);
}