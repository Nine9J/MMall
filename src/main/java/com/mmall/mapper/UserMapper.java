package com.mmall.mapper;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**用户模块持久层接口*/
@Mapper
public interface UserMapper {
    /**
     * 插入用户数据
     * @param user 用户对象
     * return 受影响的行数
     * */
    Integer insert(User user);

    /**
     * 根据用户名查找
     * @param username 用户名
     * return 如果找到则返回用户对象,如果没有找到则返回null
     * */
    User selectByName(String username);

    /**
     * 根据uid查找
     * @param uid
     * @return 如果找到则返回用户对象,如果没有找到则返回null
     */
    User selectByUid(Integer uid);

    /**
     * 根据用户名修改电话号码
     * @param user
     */
    void updatePhoneByUsername(User user);
}
