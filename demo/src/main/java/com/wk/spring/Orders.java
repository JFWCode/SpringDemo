package com.wk.spring;

import java.util.Arrays;

public class Orders {

    private String name;
    private int value;
    private int test;
    private int[] productId;

    public Orders(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public Orders(String name, int value, int test, int[] productId) {
        this.name = name;
        this.value = value;
        this.test = test;
        this.productId = productId;
    }

    public void printOrders() {
        System.out.println("Name:" + name);
        System.out.println("Value: " + value);
        System.out.println("Test: " + test);
        System.out.println("Test: " + Arrays.toString(productId));
    }
}
