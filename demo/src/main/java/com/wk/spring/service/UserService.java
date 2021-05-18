package com.wk.spring.service;

import com.wk.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
@Transactional(propagation = Propagation.REQUIRED,
        isolation = Isolation.REPEATABLE_READ,
        noRollbackFor = {ArithmeticException.class},
        timeout = 1)
public class UserService {

    @Autowired
    private UserDao userDao;

    public void transferMoney() {
        userDao.reduceMoney();
        System.out.println(userDao.findAllUser());

//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        // 制造一个异常
//        int c = 100/0;

        System.out.println(userDao.findAllUser());
        userDao.addMoney();
    }
}
