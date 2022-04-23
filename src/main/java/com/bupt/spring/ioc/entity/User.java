package com.bupt.spring.ioc.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author: 金培源
 * @Date: 2022/4/4 19:31
 * @Version: 1.0
 * @Description:
 */
public class User implements ApplicationContextAware {
    private String username;
    private Integer age;
    private String address;
    private Book book;
    private ApplicationContext applicationContext;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", book=" + book +
                '}';
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
    }

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void test() {
        System.out.println(getBook());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
