package com.frostywhale.task.invoice.domain;

import java.math.BigDecimal;

public class InvoiceItem {
    private String itemName;
    private Integer quantity;
    private BigDecimal price;

    public InvoiceItem(String itemName, Integer quantity, BigDecimal price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }
}