package com.engine.util;

public class DiscountService {
    public static double applyFlatDiscount(double amount) {
        return amount > 500 ? amount - 50.0 : amount;
    }
}
