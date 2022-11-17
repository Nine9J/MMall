package com.mmall.mapper;

import com.mmall.pojo.Cart;
import com.mmall.pojo.Order;
import com.mmall.util.AdminOrder;
import com.mmall.util.CartInfo;
import com.mmall.util.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface OrderMapper {
    /**
     * 向数据库插入购物车数据
     * @param order
     * @return
     */
    Integer insert(Order order);

    /**
     * 根据cid删除数据
     * @param oid
     * @return
     */
    Integer delete(Integer oid);

    /**
     * 使用cid查询
     * @param oid
     * @return
     */
    Order selectByOid(Integer oid);

    /**
     * 根据uid查询所有
     * 用于购物车展示
     * @param uid
     * @return
     */
    ArrayList<OrderInfo> selectByUid(Integer uid);

    /**
     * 确认订单，修改状态
     * @param oid
     */
    Integer updateState(Integer oid,String state);

    String selectState(Integer oid);

    /**
     * 查询全部订单
     * @return
     */
    ArrayList<AdminOrder> selectAll();
}
