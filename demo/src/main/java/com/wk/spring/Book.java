package com.wk.spring;

public class Book {

    private String name;
    private String category;

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printBook() {
        System.out.println("Category:" + category);
        System.out.println("Book name: " + name);
    }
}
