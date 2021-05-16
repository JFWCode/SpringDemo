package com.wk.spring.dao;

import java.util.List;

public interface UserDao {

    public List<User> findAllUser();
    public int add(User user);
    public int update(String value);
    public Boolean delete(User user);
    public void reduceMoney();
    public void addMoney();
}
