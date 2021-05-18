package com.wk.spring.dao;

import com.wk.spring.core.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAllUser() {
        String sql = "SELECT *\n" +
                "FROM User";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));;

        return userList;
    }

    @Override
    public int add(User user) {
        String sql = "INSERT INTO User (name, age) VALUES (?, ?)";
        Object[] args = new Object[]{user.getName(), user.getAge()};
        int update = jdbcTemplate.update(sql, args);
        return update;
    }

    @Override
    public int update(String value) {
        System.out.println("Update");
        System.out.println(value);
        return 1;
    }

    @Override
    public Boolean delete(User user) {
        String sql = "DELETE FROM User WHERE name=? AND age=?";
        Object[] args = new Object[]{user.getName(), user.getAge()};
        int update = jdbcTemplate.update(sql, args);
        return true;
    }

    @Override
    public void reduceMoney() {
        String sql = "update User set money=money-? where name=?";
        jdbcTemplate.update(sql,100,"lucy");
    }

    @Override
    public void addMoney() {
        String sql = "update User set money=money+? where name=?";
        jdbcTemplate.update(sql,100,"mary");
    }

}
