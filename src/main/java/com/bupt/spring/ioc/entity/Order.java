package com.bupt.spring.ioc.entity;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: 金培源
 * @Date: 2022/4/6 10:27
 * @Version: 1.0
 * @Description:
 */
public class Order implements InitializingBean {
    private String oname;

    public Order(String oname) {
        System.out.println("第一步：调用构造器");
        this.oname = oname;
    }

    public Order() {
        System.out.println("第一步：调用构造器");
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        System.out.println("第二步：通过set方法注入");
        this.oname = oname;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oname='" + oname + '\'' +
                '}';
    }

    public void initMethed() {
        System.out.println("第四步：初始化方法");
    }

    public void destroyMethod() {
        System.out.println("第七步：销毁对象");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("设属性值");
    }
}
