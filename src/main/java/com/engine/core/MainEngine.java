package com.engine.core;

import com.engine.model.OrderPayload;
import com.engine.util.TaxCalculator;

public class MainEngine {
    public static void main(String[] args) {
        OrderPayload order = new OrderPayload("ORD-101", 1000.0);
        double tax = TaxCalculator.calculateTax(order.getAmount());
        System.out.println("Order: " + order.getOrderId() + " | Total with Tax: " + (order.getAmount() + tax));
    }
}
