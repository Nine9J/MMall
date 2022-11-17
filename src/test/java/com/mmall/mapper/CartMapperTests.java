package com.mmall.mapper;

import com.mmall.pojo.Cart;
import com.mmall.util.CartInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CartMapperTests {
    @Autowired
    private CartMapper cartMapper;

    @Test
    public void insert(){
        Cart cart = new Cart();
        cart.setPid(3);
        cart.setUid(1);
        cart.setPrice(10);
        cartMapper.insert(cart);
    }

    @Test
    public void delete(){
        cartMapper.delete(1);
    }

    @Test
    public void selectByCid(){
        Cart result = cartMapper.selectByCid(2);
        System.out.println(result);
    }

    @Test
    public void selectById(){
        Cart result = cartMapper.selectById(2,1);
        System.out.println(result);
    }
    @Test
    public void selectByUid(){
        ArrayList<CartInfo> list = cartMapper.selectByUid(1);
        System.out.println(list);
    }

}
