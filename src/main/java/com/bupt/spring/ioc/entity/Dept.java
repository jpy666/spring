package com.bupt.spring.ioc.entity;

/**
 * @Author: 金培源
 * @Date: 2022/4/4 20:32
 * @Version: 1.0
 * @Description:
 */
public class Dept {
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
