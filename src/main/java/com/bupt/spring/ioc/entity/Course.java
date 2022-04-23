package com.bupt.spring.ioc.entity;

/**
 * @Author: 金培源
 * @Date: 2022/4/4 20:58
 * @Version: 1.0
 * @Description:
 */
public class Course {
    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }

    private String cname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
