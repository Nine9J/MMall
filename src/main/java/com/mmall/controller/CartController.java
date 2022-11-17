package com.mmall.controller;

import com.mmall.pojo.Cart;
import com.mmall.service.CartService;
import com.mmall.util.CartInfo;
import com.mmall.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
@RequestMapping("Cart")
public class CartController extends BaseController{
    @Autowired
    private CartService cartService;

    @RequestMapping("add")
    public JsonResult<Void> add(Integer pid,Integer price,HttpSession session){
        Integer uid = Integer.parseInt(session.getAttribute("uid").toString());
        Cart cart = new Cart();
        cart.setUid(uid);
        cart.setPid(pid);
        cart.setPrice(price);
        cartService.add(cart);
        return new JsonResult<>(OK);
    }

    @RequestMapping("delete")
    public JsonResult<Void> delete(Integer cid){
        cartService.delete(cid);
        return new JsonResult<>(OK);
    }

    @RequestMapping("selectByUid")
    public JsonResult<ArrayList<CartInfo>> selectByUid(HttpSession session){
        Integer uid  = Integer.parseInt(session.getAttribute("uid").toString());
        ArrayList<CartInfo> data = cartService.selectByUid(uid);
        return new JsonResult<>(OK,data);
    }
}
