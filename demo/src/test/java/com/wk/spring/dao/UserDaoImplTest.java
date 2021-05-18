package com.wk.spring.dao;

import com.wk.spring.core.model.User;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserDaoImplTest extends TestCase {

    public void testAdd() {
        User user = new User();
        user.setAge(20);
        user.setName("jone");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:jdbc.xml");
        UserDaoImpl userDao = context.getBean("userDaoImpl", UserDaoImpl.class);

        int add = userDao.add(user);

        System.out.println(add);

        List<User> allUser = userDao.findAllUser();
        System.out.printf("list length: %d", allUser.size());
        System.out.println(allUser.toString());

//        userDao.delete(user);
//
//        allUser = userDao.findAllUser();
//        System.out.printf("list length: %d", allUser.size());
//        System.out.println(allUser.toString());
    }
}