package com.bupt.spring.ioc.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: 金培源
 * @Date: 2022/4/5 9:46
 * @Version: 1.0
 * @Description:
 */
public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        return new Course();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
