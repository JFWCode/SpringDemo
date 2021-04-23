package com.wk.spring;

public class Book {

    private String name;
    private String category;
    private Author author;

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

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
