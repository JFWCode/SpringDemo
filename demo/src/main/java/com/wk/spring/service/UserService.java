package com.wk.spring.service;

import com.wk.spring.dao.User;
import com.wk.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.NEVER)
public class UserService {

    @Autowired
    private UserDao userDao;

    public void transferMoney() {
        userDao.reduceMoney();

        // 制造一个异常
        int c = 100/0;

        userDao.addMoney();
    }
}
