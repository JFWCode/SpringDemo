package com.wk.spring;


import org.springframework.stereotype.Component;

@Component(value = "hello")
public class HelloWorld {

    public void sayHello() {
        System.out.println("hello");
    }
}
