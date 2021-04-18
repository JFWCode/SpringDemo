package com.wk.spring.testdemo;

import com.wk.spring.Book;
import com.wk.spring.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestDemo {

    @Test
    public void testBook1() {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/bean.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.printBook();
    }

    @Test
    public void testOrder() {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/bean.xml");

        Orders order = context.getBean("orders", Orders.class);
        System.out.println(order);
        order.printOrders();
    }
}


