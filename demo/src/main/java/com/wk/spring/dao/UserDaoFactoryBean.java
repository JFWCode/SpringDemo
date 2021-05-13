package com.wk.spring.dao;

import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDaoImpl.class;
    }
}
