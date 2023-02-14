package com.frostywhale.task.order.domain;

import java.math.BigDecimal;

public class OrderItem {
    private String itemName;
    private int quantity;
    private BigDecimal price;

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}