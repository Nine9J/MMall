package com.mmall.controller;

import com.mmall.pojo.Order;
import com.mmall.service.OrderService;
import com.mmall.util.AdminOrder;
import com.mmall.util.JsonResult;
import com.mmall.util.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
@RequestMapping("order")
public class OrderController extends BaseController{
    @Autowired
    private OrderService orderService;

    @RequestMapping("add")
    public JsonResult<Void> add(Integer pid,Integer price,HttpSession session){
        Integer uid = Integer.parseInt(session.getAttribute("uid").toString());
        Order order = new Order();
        order.setUid(uid);
        order.setPid(pid);
        order.setPrice(price);
        order.setState("未发货");
        orderService.add(order);
        return new JsonResult<>(OK);
    }

    @RequestMapping("confirmRec")
    public JsonResult<Void> confirmRec(Integer oid){
        orderService.updateState(oid,"已收货");
        return new JsonResult<>(OK);
    }
    @RequestMapping("confirmDis")
    public JsonResult<Void> confirmDis(Integer oid){
        String state = orderService.selectState(oid);
        if("未发货".equals(state)) {
            orderService.updateState(oid, "已发货");
        }
        return new JsonResult<>(OK);
    }


    @RequestMapping("delete")
    public JsonResult<Void> delete(Integer oid){
        orderService.delete(oid);
        return new JsonResult<>(OK);
    }

    @RequestMapping("selectByUid")
    public JsonResult<ArrayList<OrderInfo>> selectByUid(HttpSession session){
        Integer uid  = Integer.parseInt(session.getAttribute("uid").toString());
        ArrayList<OrderInfo> result = orderService.selectByUid(uid);
        return new JsonResult<>(OK,result);
    }

    @RequestMapping("selectAll")
    public JsonResult<ArrayList<AdminOrder>> selectAll(){
        ArrayList<AdminOrder> result = orderService.selectAll();
        return new JsonResult<>(OK,result);
    }
}
