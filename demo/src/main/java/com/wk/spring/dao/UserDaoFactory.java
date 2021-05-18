package com.wk.spring.dao;


public class UserDaoFactory  {

    public static UserDaoImpl getUserDao() {
        System.out.println("get a UserDao instance");
        return new UserDaoImpl();
    }
}
