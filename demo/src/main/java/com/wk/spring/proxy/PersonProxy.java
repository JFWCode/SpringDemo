package com.wk.spring.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class PersonProxy {
    @Pointcut("execution(* com.wk.spring.proxy.User.add(..))")
    public void point() {

    }

    @Before("point()")
    public void before() {
        System.out.println("person before");
    }
}
