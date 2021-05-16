package com.wk.spring.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class UserProxy {

    @Before("execution(* com.wk.spring.proxy.User.add(..))")
    public void before() {
        System.out.println("before...");
    }

    @Around("execution(* com.wk.spring.proxy.User.add(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before");
        pjp.proceed();
        System.out.println("around after");
        return null;
    }

    @After("execution(* com.wk.spring.proxy.User.add(..))")
    public void after() {
        System.out.println("after...");
    }

    @AfterReturning("execution(* com.wk.spring.proxy.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning...");
    }

    @AfterThrowing("execution(* com.wk.spring.proxy.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }
}
