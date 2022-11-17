package com.mmall.service;

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
public class CartServiceTests {
    @Autowired
    private CartService cartService;

    @Test
    public void add(){
        Cart cart = new Cart();
        cart.setPid(2);
        cart.setUid(1);
        cart.setPrice(10);
        cartService.add(cart);
    }

    @Test
    public void delete(){
        cartService.delete(4);
    }

    @Test
    public void selectByUid(){
        ArrayList<CartInfo> list = cartService.selectByUid(1);
        System.out.println(list);
    }
}
