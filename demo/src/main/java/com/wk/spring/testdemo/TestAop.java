package com.wk.spring.testdemo;

import com.wk.spring.config.SpringConfig;
import com.wk.spring.proxy.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAspectJByAnnotation() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAspectJByXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop_1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
