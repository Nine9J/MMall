package com.mmall.service;

import com.mmall.pojo.Cart;
import com.mmall.pojo.Order;
import com.mmall.util.AdminOrder;
import com.mmall.util.CartInfo;
import com.mmall.util.OrderInfo;

import java.util.ArrayList;

public interface OrderService {
    /**
     * 添加到订单
     * @param order
     */
    void add(Order order);

    /**
     * 根据oid删除
     * @param oid
     */
    void delete(Integer oid);

    /**
     * 根据用户id查询所有
     * @param uid
     * @return
     */
    ArrayList<OrderInfo> selectByUid(Integer uid);

    void updateState(Integer oid,String state);

    String selectState(Integer oid);

    ArrayList<AdminOrder> selectAll();
}
