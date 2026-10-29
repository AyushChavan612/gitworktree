package com.engine.util;

public class TaxCalculator {
    public static double calculateTax(double amount) {
        return Math.round((amount * 0.18) * 100.0) / 100.0;
    }
}
