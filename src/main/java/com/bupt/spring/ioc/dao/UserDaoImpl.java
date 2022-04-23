package com.bupt.spring.ioc.dao;

/**
 * @Author: 金培源
 * @Date: 2022/4/4 20:27
 * @Version: 1.0
 * @Description:
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        int i = 10 / 0;
        System.out.println("dao add...");
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
