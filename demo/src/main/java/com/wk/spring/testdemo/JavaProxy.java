package com.wk.spring.testdemo;

import com.wk.spring.dao.UserDao;
import com.wk.spring.dao.UserDaoImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JavaProxy {
    @Test
    public void testProxy() {

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(UserDaoImpl.class.getClassLoader(), userDao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before " + method.getName());

                Object res = method.invoke(userDao, args);

                System.out.println("after " + method.getName());
                return res;
            }
        });

        dao.update("?");
    }

    @Test
    public void testProxyNewClass() {

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(UserDaoImpl.class.getClassLoader(),
                userDao.getClass().getInterfaces(),
                new UserDaoProxy(userDao));

        dao.update("?");
    }
}

class UserDaoProxy implements InvocationHandler {
    private UserDao dao;

    public UserDaoProxy() {
    }

    public UserDaoProxy(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before " + method.getName());

        Object res = method.invoke(dao, args);

        System.out.println("after " + method.getName());
        return res;
    }
}
