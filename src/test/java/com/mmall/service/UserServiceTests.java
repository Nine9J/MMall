package com.mmall.service;

import com.mmall.mapper.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.ex.ServiceException;
import com.mmall.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTests {
    @Autowired
    private UserService userService;

    @Test
    public void reg(){
        try {
            User user = new User();
            user.setUsername("jzh");
            user.setPassword("123456");
            userService.reg(user);
            System.out.println("OK");
        } catch (ServiceException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void Login(){
        User user = userService.Login("lys","123456");
        System.out.println(user);
    }

    @Test
    public void checkName(){
        User user = new User();
        user.setUsername("bxhwuy");
        User result = userService.checkName(user);
        System.out.println(result);
    }

    @Test
    public void updatePhone(){
        User user = new User();
        user.setUsername("lys");
        user.setPhone("908878");
        userService.updatePhone(user);
    }
}
