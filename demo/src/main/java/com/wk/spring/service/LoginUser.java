package com.wk.spring.service;

import com.wk.spring.dao.UserDao;
import com.wk.spring.dao.UserDaoFactoryBean;
import com.wk.spring.dao.UserDaoImpl;

import java.util.zip.Adler32;

public class LoginUser implements LoginService {
    UserDaoImpl user;

    @Override
    public void updateUser(String value) {
    }

    public void setUser(UserDaoImpl user) {
        this.user = user;
    }

    public UserDaoImpl getUser() {
        return user;
    }
}
