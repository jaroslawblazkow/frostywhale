package com.frostywhale.task.invoice;

import com.frostywhale.task.invoice.application.InvoiceService;
import com.frostywhale.task.invoice.infrastacture.InvoiceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class InvoiceConfig {

    @Bean
    InvoiceService invoiceService(InvoiceRepository invoiceRepository) {
        return new InvoiceService(invoiceRepository);
    }

}