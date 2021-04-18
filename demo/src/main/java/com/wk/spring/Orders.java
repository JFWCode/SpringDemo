package com.wk.spring;

public class Orders {

    private String name;
    private int value;
    private int test;

    public Orders(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public Orders(String name, int value, int test) {
        this.name = name;
        this.value = value;
        this.test = test;
    }

    public void printOrders() {
        System.out.println("Name:" + name);
        System.out.println("Value: " + value);
        System.out.println("Test: " + test);
    }
}
