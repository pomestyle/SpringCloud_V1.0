package com.example.eurekaserver.eurekaserver;

/**
 * @description: user
 * @author: Administrator
 * @create: 2019-11-06 22:34
 **/
public class User {

    private int id;
    private String name;
    private String sex;
    private String count;

    public User(int id, String name, String sex, String count) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
