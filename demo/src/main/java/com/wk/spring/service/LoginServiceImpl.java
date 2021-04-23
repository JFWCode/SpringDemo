package com.wk.spring.service;

import com.wk.spring.config.SpringConfig;
import com.wk.spring.dao.UserDao;
import com.wk.spring.dao.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;

@Component(value = "login")
public class LoginServiceImpl implements LoginService {

//    @Autowired
//    @Qualifier(value = "UserDaoIml")
    @Resource(name = "userDaoImpl")
    private UserDao user;

    public void setUser(UserDao user) {
        this.user = user;
    }

    public UserDao getUser() {
        return user;
    }

    @Override
    public void updateUser(String value) {
        MathOperation add = (x, y) -> x + y;
        MathOperation sub = (x, y) -> {
            return x - y;
        };
        Creeting c = val -> {
            System.out.println(val);
        };
        c.greeting("down");
        System.out.println(add.operator(12, 21));
        System.out.println(sub.operator(12, 21));
        user.update(value);
    }

    interface MathOperation {
        int operator(int a, int b);
    }

   interface Creeting {
        void greeting(String val);
    }

    @Test
    public void TestUpdateUser() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        LoginService login = context.getBean("login", LoginService.class);
        login.updateUser("JFW");
    }

    @Test
    public void TestUpdateUser1() {
        LoginServiceImpl loginService = new LoginServiceImpl();
        loginService.setUser(new UserDaoImpl());
        loginService.updateUser("JFW");
    }
}
