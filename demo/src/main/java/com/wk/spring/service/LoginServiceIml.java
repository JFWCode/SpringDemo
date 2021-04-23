package com.wk.spring.service;

import com.wk.spring.dao.UserDao;
import com.wk.spring.dao.UserDaoIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "login")
public class LoginServiceIml implements LoginService {
//    @Autowired
//    @Qualifier(value = "UserDaoIml")
    @Resource(type = UserDaoIml.class)
    private UserDao user;

    public UserDao getUser() {
        return user;
    }

    @Override
    public void updateUser() {
        user.update("wk");
    }
}
