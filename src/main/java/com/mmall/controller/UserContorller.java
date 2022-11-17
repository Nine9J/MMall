package com.mmall.controller;

import com.mmall.pojo.User;
import com.mmall.service.UserService;
import com.mmall.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("users")
public class UserContorller extends BaseController{
    @Autowired
    UserService userService;

    @RequestMapping("reg")
    public JsonResult<Void> reg(User user){
        userService.reg(user);
        //如果出现异常，由基类的handleException函数捕获并返回
        return new JsonResult<Void>(OK);
    }

    @RequestMapping("checkName")
    public JsonResult<Void> checkName(User user){
        userService.checkName(user);
        //如果出现用户名重复，由BaseController的handException函数捕获并返回
        return new JsonResult<Void>(OK);
    }

    @RequestMapping("login")
    public JsonResult<User> login(String username, String password, HttpSession session){
        User user = userService.Login(username,password);
        //将数据封装入session中
        session.setAttribute("uid",user.getUid());
        session.setAttribute("username",user.getUsername());
        session.setAttribute("isAdmin",user.getIsAdmin());
        // 如果出现用户名不存在或者密码错误的异常，由BaseController的handException函数捕获并返回
        return new JsonResult<User>(OK,user);
    }

    @RequestMapping("adminLogin")
    public JsonResult<User> adminlogin(String username, String password, HttpSession session) {
        User user = userService.adminLogin(username, password);
        //将数据封装入session中
        session.setAttribute("uid", user.getUid());
        session.setAttribute("username", user.getUsername());
        session.setAttribute("isAdmin",user.getIsAdmin());
        // 如果出现用户名不存在或者密码错误的异常，由BaseController的handException函数捕获并返回
        return new JsonResult<User>(OK, user);
    }

    @RequestMapping("updatePhone")
    public JsonResult<User> updatePhone(String phone ,HttpSession session){
        User user = new User();
        String username  = session.getAttribute("username").toString();
        user.setUsername(username);
        user.setPhone(phone);
        System.out.println(session.getAttribute("username").toString());
        userService.updatePhone(user);
        return new JsonResult<User>(OK,user);
    }

    @RequestMapping("get_by_uid")
    public JsonResult<User> selectByUid(HttpSession session){
        User data =
                userService.selectByUid(Integer.parseInt(session.getAttribute("uid").toString()));
        return new JsonResult<User>(OK,data);
    }

    @RequestMapping("logout")
    public JsonResult<Void> logout(HttpSession session){
        session.setAttribute("uid",null);
        session.setAttribute("username",null);
        session.setAttribute("isAdmin",0);
        return new JsonResult<>(OK);
    }
}
