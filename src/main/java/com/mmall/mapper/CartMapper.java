package com.mmall.mapper;

import com.mmall.pojo.Cart;
import com.mmall.util.CartInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface CartMapper {
    /**
     * 向数据库插入购物车数据
     * @param cart
     * @return
     */
    Integer insert(Cart cart);

    /**
     * 根据cid删除数据
     * @param cid
     * @return
     */
    Integer delete(Integer cid);

    /**
     * 使用cid查询
     * @param cid
     * @return
     */
    Cart selectByCid(Integer cid);

    /**
     * 根据用户id和商品id查询
     * @param uid
     * @param pid
     * @return
     */
    Cart selectById(Integer uid,Integer pid);

    /**
     * 根据uid查询所有
     * 用于购物车展示
     * @param uid
     * @return
     */
    ArrayList<CartInfo> selectByUid(Integer uid);
}
