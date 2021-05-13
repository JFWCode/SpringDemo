package com.wk.spring.testdemo;

import com.wk.spring.config.SpringConfig;
import com.wk.spring.dao.UserDaoImpl;
import com.wk.spring.service.LoginServiceImpl;
import com.wk.spring.service.LoginUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
    @Test
    public void Test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:bean3.xml");

        LoginUser lu = (LoginUser) context.getBean("login", LoginUser.class);
        System.out.println(lu);
        System.out.println(lu.getUser());
        lu.getUser().update("what");
    }
}
