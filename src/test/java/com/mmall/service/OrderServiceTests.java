package com.mmall.service;

import com.mmall.pojo.Order;
import com.mmall.util.OrderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderServiceTests {
    @Autowired
    private OrderService orderService;

    @Test
    public void add(){
        Order order = new Order();
        order.setUid(2);
        order.setPid(32);
        order.setPrice(100);
        order.setState("未发货");
        orderService.add(order);
    }

    @Test
    public void delete(){
        orderService.delete(4);
    }

    @Test
    public void selectByUid(){
        ArrayList<OrderInfo> result = orderService.selectByUid(1);
        System.out.println(result);
    }

    @Test
    public void updateState(){
        orderService.updateState(28,"已收货");
    }
}
