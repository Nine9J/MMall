package com.mmall.controller;

import com.mmall.service.ex.*;
import com.mmall.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

/** 控制层类的基类 */
public class BaseController {
    /** 注册成功状态码 */
    public static final Integer OK = 200;

    @ExceptionHandler(ServiceException.class)
    public JsonResult<Void> handleException(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);
        if(e instanceof UsernameDuplicatedException){
            result.setState(4000);
            result.setMessage("用户名被占用");
        } else if (e instanceof UserInsertException) {
            result.setState(5000);
            result.setMessage("注册产生了未知异常");
        } else if (e instanceof UsernameNotFoundExcept) {
            result.setState(5001);
            result.setMessage("用户名不存在");
        } else if (e instanceof PasswordNotMatchedException) {
            result.setState(5002);
            result.setMessage("密码错误");
        } else if (e instanceof SessionOverdueException) {
            result.setState(5003);
            result.setMessage("Session过期");
        } else if (e instanceof UidNotFoundException) {
            result.setState(5004);
            result.setMessage("uid不存在");
        } else if (e instanceof ProductInsertException) {
            result.setState(5005);
            result.setMessage("添加商品时产生了未知错误");
        } else if (e instanceof ProductUpdateException) {
            result.setState(5006);
            result.setMessage("修改商品信息时产生了未知错误");
        } else if (e instanceof ProductDeleteException) {
            result.setState(5007);
            result.setMessage("删除商品信息时产生了未知错误");
        } else if (e instanceof CidExistException) {
            result.setState(6001);
            result.setMessage("购物车数据已存在");
        } else if (e instanceof CartInsertException) {
            result.setState(6002);
            result.setMessage("购物车数据插入异常");
        } else if (e instanceof CartDeleteException) {
            result.setState(6003);
            result.setMessage("购物车数据删除异常");
        } else if (e instanceof CartNotFoundException) {
            result.setState(6004);
            result.setMessage("购物车数据不存在");
        }else if(e instanceof OrderInsertException){
            result.setState(7001);
            result.setMessage("订单插入出现未知异常");
        } else if (e instanceof OrderNotFoundException) {
            result.setState(7002);
            result.setMessage("订单不存在");
        } else if (e instanceof OrderDeleteException) {
            result.setState(7003);
            result.setMessage("删除订单时出现未知异常");
        } else if (e instanceof OrderUpdateException) {
            result.setState(7004);
            result.setMessage("更新订单状态时出现未知异常");
        }
        return result;
    }

    /**
     * 从session获取已登录用户的UID
     * @param httpSession
     * @return
     */
    protected final Integer getuidFromSession(HttpSession httpSession){
        return Integer.valueOf(httpSession.getAttribute("uid").toString());
    }

    /**
     * 从session获取已登录用户的用户名
     * @param httpSession
     * @return
     */
    protected final String getusernameFromSession(HttpSession httpSession){
        return httpSession.getAttribute("username").toString();
    }

}
