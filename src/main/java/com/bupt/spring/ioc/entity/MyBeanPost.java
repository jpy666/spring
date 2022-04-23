package com.bupt.spring.ioc.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: 金培源
 * @Date: 2022/4/6 10:41
 * @Version: 1.0
 * @Description:
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // 对所有的bean统一处理
        System.out.println("第三步：前置处理");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步：后置处理");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
