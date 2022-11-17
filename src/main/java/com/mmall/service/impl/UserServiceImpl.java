package com.mmall.service.impl;

import com.mmall.mapper.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.UserService;
import com.mmall.service.ex.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void reg(User user) {
        //接收user传过来的username
        String username = user.getUsername();

        //首先调用selectByName判断用户名是否被占用
        User result = userMapper.selectByName(username);

        //结果不为null则说明用户名被占用
        if(result!=null){
            throw new UsernameDuplicatedException("用户名被占用！");
        }

        //补全数据
        user.setIsAdmin(0);

        //执行注册逻辑
        Integer rows = userMapper.insert(user);

        if(rows!=1){
            throw new UserInsertException("用户注册时发生未知错误！");
        }
    }

    @Override
    public User checkName(User user) {
        //接收user传过来的username
        String username = user.getUsername();

        //首先调用selectByName判断用户名是否被占用
        User result = userMapper.selectByName(username);

        //结果不为null则说明用户名被占用
        if(result!=null){
            throw new UsernameDuplicatedException("用户名被占用！");
        }
        return result;
    }

    @Override
    public User Login(String username, String password) {
        // 根据用户名查询用户名称是否存在
        // 如果不存在，抛出UsernameNotFoundException
        User result = userMapper.selectByName(username);
        // 如果是用户真的不存在或者是isAdmin==1，则抛出用户不存在
        if(result == null || result.getIsAdmin() == 1){
            throw new UsernameNotFoundExcept("用户名不存在");
        }
        if(!result.getPassword().equals(password)){
            throw new PasswordNotMatchedException("密码错误");
        }

        User user = new User();
        user.setUid(result.getUid());
        user.setUsername(result.getUsername());
        user.setIsAdmin(0);
        return user;
    }

    @Override
    public User adminLogin(String username, String password) {
        // 根据用户名查询用户名称是否存在
        // 如果不存在，抛出UsernameNotFoundException
        User result = userMapper.selectByName(username);
        // 如果是用户名真的不存在或者isAdmin==0，则抛出管理员不存在
        if(result == null || result.getIsAdmin() == 0){
            throw new UsernameNotFoundExcept("管理员不存在");
        }
        if(!result.getPassword().equals(password)){
            throw new PasswordNotMatchedException("密码错误");
        }

        User user = new User();
        user.setUid(result.getUid());
        user.setUsername(result.getUsername());
        user.setIsAdmin(1);
        return user;
    }

    @Override
    public void updatePhone(User user) {
        if(user.getUsername()==null || user.getUsername() == ""){
            throw new SessionOverdueException("Session过期");
        }
        userMapper.updatePhoneByUsername(user);
    }

    @Override
    public User selectByUid(Integer uid) {
        User result = userMapper.selectByUid(uid);
        if(result==null){
            throw new UidNotFoundException("uid不存在");
        }
        return result;
    }
}
