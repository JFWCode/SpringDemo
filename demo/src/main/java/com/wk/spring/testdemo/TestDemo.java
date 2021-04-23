package com.wk.spring.testdemo;

import com.wk.spring.Book;
import com.wk.spring.HelloWorld;
import com.wk.spring.Orders;
import com.wk.spring.config.SpringConfig;
import com.wk.spring.service.LoginService;
import com.wk.spring.service.LoginServiceIml;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Path;


public class TestDemo {

    @Test
    public void testBook1() {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/resources/bean.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.printBook();
    }

    @Test
    public void testOrder() {
        System.out.println(this.getClass().getResource(""));
        System.out.println(System.getProperty("user.dir"));
//        ApplicationContext context =
//                new FileSystemXmlApplicationContext("src/main/java/bean.xml");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:bean.xml");

        Orders order = context.getBean("orders", Orders.class);
        System.out.println(order);
        order.printOrders();
    }

    @Test
    public void testDemo1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.getAuthor().tryMe();
        System.out.println(book.getAuthor().toString());
        book.printBook();
    }

    @Test
    public void testDemo3() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        LoginServiceIml login = context.getBean("login", LoginServiceIml.class);
        System.out.println(login);
        System.out.println(login.getUser());
        login.getUser().update("what");
    }
}


