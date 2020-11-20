package com.company;

public class CounterOfObjects {
    private static int quantity = 0;

    public CounterOfObjects() {
        quantity++;
    }

    public static int getQuantity() {
        return quantity;
    }

}
