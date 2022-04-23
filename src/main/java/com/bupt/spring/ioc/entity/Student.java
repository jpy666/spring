package com.bupt.spring.ioc.entity;

import java.util.*;

/**
 * @Author: 金培源
 * @Date: 2022/4/4 20:48
 * @Version: 1.0
 * @Description:
 */
public class Student {
    private String[] courses;
    private List<String> lists;
    private Map<String,String> maps;
    private Set<String> sets;
    private Properties properties;
    private List<Course> courseList;

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", lists=" + lists +
                ", maps=" + maps +
                ", sets=" + sets +
                ", properties=" + properties +
                ", courseList=" + courseList +
                '}';
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
}
