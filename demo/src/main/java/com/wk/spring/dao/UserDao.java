package com.wk.spring.dao;

import com.wk.spring.core.model.User;

import java.util.List;

public interface UserDao {

    public List<User> findAllUser();
    public int add(User user);
    public int update(String value);
    public Boolean delete(User user);
    public void reduceMoney();
    public void addMoney();
}
