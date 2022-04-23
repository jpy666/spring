package com.bupt.spring.ioc.dao;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author: 金培源
 * @Date: 2022/4/22 9:54
 * @Version: 1.0
 * @Description:
 */
public class AOPAdvise {
    public void before() {
        System.out.println("前置通知");
    }

    public void after() {
        System.out.println("最终通知");
    }

    public void afterReturing() {
        System.out.println("后置通知");
    }

    public void around(ProceedingJoinPoint point) {
        System.out.println("around before");

        try {
            point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("around before");
    }

    public void afterThrowing() {
        System.out.println("异常通知");
    }
}
