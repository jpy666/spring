package com.bupt.spring.ioc.tx;

/**
 * @Author: 金培源
 * @Date: 2022/4/22 20:06
 * @Version: 1.0
 * @Description:
 */
public interface Bank {
    void decMoney(int id,int money);
    void incMoney(int id,int money);
    void bank();
}
