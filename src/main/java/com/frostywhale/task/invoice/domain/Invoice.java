package com.frostywhale.task.invoice.domain;

import com.frostywhale.task.customer.domain.CustomerId;
import com.frostywhale.task.order.domain.OrderPaidEvent;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Invoice {
    private InvoiceId invoiceNumber;
    private LocalDate date;
    private CustomerId customerId;
    private List<InvoiceItem> items;
    private BigDecimal totalAmount;

    public static Invoice issue(OrderPaidEvent event) {
        Invoice invoice = new Invoice();
        invoice.customerId = event.getCustomerId();
        invoice.date = LocalDate.now();
        invoice.invoiceNumber = InvoiceId.of(UUID.randomUUID());
        List<InvoiceItem> invoiceItems = event.getOrderItems().stream()
                .map(it -> new InvoiceItem(it.getItemName(), it.getQuantity(), it.getPrice())).collect(Collectors.toList());
        invoice.items = invoiceItems;
        invoice.totalAmount = invoiceItems.stream().map(InvoiceItem::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        return invoice;
    }
}
