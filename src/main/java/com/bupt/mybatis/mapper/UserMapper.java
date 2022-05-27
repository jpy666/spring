package com.bupt.mybatis.mapper;

import com.bupt.mybatis.pojo.User;

import java.util.List;

/**
 * @Author: 金培源
 * @Date: 2022/4/24 10:44
 * @Version: 1.0
 * @Description:
 */
public interface UserMapper {
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();
}
