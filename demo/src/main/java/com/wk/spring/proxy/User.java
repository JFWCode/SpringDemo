package com.wk.spring.proxy;

import org.springframework.stereotype.Component;

@Component
public class User {

    public void add() {
        System.out.println("add...");
        throw new RuntimeException("exception");
    }
}
