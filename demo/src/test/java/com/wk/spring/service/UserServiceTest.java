package com.wk.spring.service;

import com.wk.spring.dao.UserDaoImpl;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest extends TestCase {

    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:transaction.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transferMoney();
    }
}