package com.mmall.mapper;

import com.mmall.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setUsername("lys");
        user.setPassword("123456");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }

    @Test
    public void selectByName(){
        User user = new User();
        user = userMapper.selectByName("jzh");
        System.out.println(user);
    }

    @Test
    public void updatePhoneByUsername(){
        User user = new User();
        user.setUsername("lys");
        user.setPhone("654321");
        userMapper.updatePhoneByUsername(user);
    }
}
