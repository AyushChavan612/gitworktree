package com.engine.model;

public class OrderPayload {
    private final String orderId;
    private final double amount;

    public OrderPayload(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }
}
