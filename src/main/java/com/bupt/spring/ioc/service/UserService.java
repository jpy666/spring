package com.bupt.spring.ioc.service;

import com.bupt.spring.ioc.dao.UserDao;

/**
 * @Author: 金培源
 * @Date: 2022/4/4 20:23
 * @Version: 1.0
 * @Description:
 */
public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }
}
