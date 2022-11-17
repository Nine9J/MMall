package com.mmall.service.impl;

import com.mmall.mapper.OrderMapper;
import com.mmall.pojo.Order;
import com.mmall.service.OrderService;
import com.mmall.service.ex.OrderDeleteException;
import com.mmall.service.ex.OrderInsertException;
import com.mmall.service.ex.OrderNotFoundException;
import com.mmall.service.ex.OrderUpdateException;
import com.mmall.util.AdminOrder;
import com.mmall.util.CartInfo;
import com.mmall.util.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void add(Order order) {
        Integer rows = orderMapper.insert(order);
        if(rows!=1){
            throw new OrderInsertException("订单插入出现未知异常");
        }
    }

    @Override
    public void delete(Integer oid) {
        Order order = orderMapper.selectByOid(oid);
        if(order==null){
            throw new OrderNotFoundException("订单不存在");
        }
        Integer rows = orderMapper.delete(oid);
        if(rows!=1){
            throw new OrderDeleteException("删除订单时出现未知异常");
        }
    }

    @Override
    public ArrayList<OrderInfo> selectByUid(Integer uid) {
        ArrayList<OrderInfo> result = orderMapper.selectByUid(uid);
        return result;
    }

    @Override
    public void updateState(Integer oid ,String state) {
        Order order = orderMapper.selectByOid(oid);
        if(order==null){
            throw new OrderNotFoundException("订单不存在");
        }else {
            Integer rows = orderMapper.updateState(oid,state);
            if(rows!=1){
                throw new OrderUpdateException("更新订单状态时出现未知异常");
            }
        }
    }

    @Override
    public String selectState(Integer oid) {
        return orderMapper.selectState(oid);
    }

    @Override
    public ArrayList<AdminOrder> selectAll() {
        return orderMapper.selectAll();
    }
}
