package com.bupt.spring.ioc.factory;

import com.bupt.spring.ioc.entity.User;

/**
 * @Author: 金培源
 * @Date: 2022/4/4 19:44
 * @Version: 1.0
 * @Description:
 */
public class UserFactory {
    public static User getInatance() {
        return new User();
    }
}
