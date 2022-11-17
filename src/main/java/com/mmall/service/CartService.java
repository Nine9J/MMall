package com.mmall.service;

import com.mmall.pojo.Cart;
import com.mmall.util.CartInfo;

import java.util.ArrayList;

public interface CartService {
    /**
     * 添加到购物车
     * @param cart
     */
    void add(Cart cart);

    /**
     * 根据cid删除
     * @param cid
     */
    void delete(Integer cid);

    /**
     * 根据用户id查询所有
     * @param uid
     * @return
     */
    ArrayList<CartInfo> selectByUid(Integer uid);
}
