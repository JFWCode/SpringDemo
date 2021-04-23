package com.wk.spring.testdemo;

import com.wk.spring.HelloWorld;
import com.wk.spring.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHello {

    @Test
    public void testHello() {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/bean1.xml");

        HelloWorld hw = context.getBean("hello", HelloWorld.class);
        System.out.println(hw);
        hw.sayHello();

    }

    @Test
    public void testHello1() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        HelloWorld hw = context.getBean("hello", HelloWorld.class);
        System.out.println(hw);
        hw.sayHello();
    }

    @Override
    public String toString() {
        return "TestHello{}";
    }
}
