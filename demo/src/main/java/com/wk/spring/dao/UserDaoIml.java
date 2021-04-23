package com.wk.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoIml implements UserDao {
    public void update(String value) {
        System.out.println("Update");
        System.out.println(value);
    }
}
