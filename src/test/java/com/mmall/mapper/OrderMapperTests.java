package com.mmall.mapper;

import com.mmall.pojo.Order;
import com.mmall.util.AdminOrder;
import com.mmall.util.OrderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMapperTests {
    @Autowired
    private OrderMapper orderMapper;
    @Test
    public void insert(){
        Order order = new Order();
        order.setPid(32);
        order.setUid(1);
        order.setState("未发货");
        orderMapper.insert(order);
    }
    @Test
    public void delete(){
        orderMapper.delete(2);
    }
    @Test
    public void selectByOid(){
        Order result = orderMapper.selectByOid(1);
        System.out.println(result);
    }
    @Test
    public void selectByUid(){
        ArrayList<OrderInfo> result  = orderMapper.selectByUid(1);
        System.out.println(result);
    }
    @Test
    public void updateState(){
        orderMapper.updateState(28,"已发货");
    }
    @Test
    public void selectAll(){
        ArrayList<AdminOrder> result = orderMapper.selectAll();
        System.out.println(result);
    }
}
