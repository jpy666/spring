package com.bupt.spring.ioc.dao;

/**
 * @Author: 金培源
 * @Date: 2022/4/22 11:07
 * @Version: 1.0
 * @Description:
 */
public class User {
    private Integer id;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
