package com.mmall.service;

import com.mmall.pojo.User;

/** 用户模块服务层接口 */
public interface UserService {
    /**
     * 用户注册方法
     * @param user  用户注册对象
     */
    void reg(User user);

    /**
     * 检测用户名是否重复
     * @param user 用户对象
     * */
    User checkName(User user);

    /**
     * 实现登录功能
     * @param username 用户名
     * @param password 用户密码
     * @return User 返回用户对象
     * */
    User Login(String username,String password);

    /**
     * 实现管理员登录功能
     * @param username
     * @param password
     * @return
     */
    User adminLogin(String username,String password);

    /**
     * 根据用户名修改电话号码
     * @param user
     */
    void updatePhone(User user);

    User selectByUid(Integer uid);
}
