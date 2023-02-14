package com.frostywhale.task.invoice.application;

import com.frostywhale.task.DomainEvent;
import com.frostywhale.task.invoice.domain.Invoice;
import com.frostywhale.task.invoice.infrastacture.InvoiceRepository;
import com.frostywhale.task.order.domain.OrderPaidEvent;
import org.springframework.kafka.annotation.KafkaListener;

public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @KafkaListener(topics = "domain-events")
    public void handleEvent(DomainEvent domainEvent) {
        if (domainEvent instanceof OrderPaidEvent) {
            Invoice invoice = Invoice.issue((OrderPaidEvent) domainEvent);
            invoiceRepository.save(invoice);
        }
    }
}
