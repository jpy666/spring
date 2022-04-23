package com.bupt.spring.ioc.entity;

/**
 * @Author: 金培源
 * @Date: 2022/4/4 20:32
 * @Version: 1.0
 * @Description:
 */
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
