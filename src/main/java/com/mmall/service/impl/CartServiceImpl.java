package com.mmall.service.impl;

import com.mmall.mapper.CartMapper;
import com.mmall.pojo.Cart;
import com.mmall.service.CartService;
import com.mmall.service.ex.CartDeleteException;
import com.mmall.service.ex.CartInsertException;
import com.mmall.service.ex.CartNotFoundException;
import com.mmall.service.ex.CidExistException;
import com.mmall.util.CartInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;

    @Override
    public void add(Cart cart) {
        Cart result = cartMapper.selectById(cart.getUid(),cart.getPid());
        if(result!=null){
            throw new CidExistException("购物车数据已存在");
        }
        Integer rows = cartMapper.insert(cart);
        if(rows!=1){
            throw new CartInsertException("购物车数据插入异常");
        }
    }

    @Override
    public void delete(Integer cid) {
        Cart result = cartMapper.selectByCid(cid);
        if(result==null){
            throw new CartNotFoundException("购物车数据不存在");
        }
        Integer rows = cartMapper.delete(cid);
        if(rows!=1){
            throw new CartDeleteException("购物车数据删除时产生未知错误");
        }
    }

    @Override
    public ArrayList<CartInfo> selectByUid(Integer uid) {
        ArrayList<CartInfo> result = cartMapper.selectByUid(uid);
        return result;
    }
}
