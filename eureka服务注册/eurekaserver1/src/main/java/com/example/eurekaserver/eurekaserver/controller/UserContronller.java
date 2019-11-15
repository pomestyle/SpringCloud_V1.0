package com.example.eurekaserver.eurekaserver.controller;

import com.example.eurekaserver.eurekaserver.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: user  控制层
 * @author: Administrator
 * @create: 2019-11-06 22:36
 **/

@RestController
public class UserContronller {


    private static List<User> users = new ArrayList<>();

    static  {

        users.add(new User(1,"name1","男","123user"));
        users.add(new User(2,"name2","男","123user"));
        users.add(new User(3,"name3","男","123user"));
        users.add(new User(4,"name4","男","123user"));
        users.add(new User(5,"name5","男","123user"));
        users.add(new User(6,"name6","男","123user"));
    }

    @RequestMapping("getUser")
    public  User getUser(int id){
        return    new User(1,"name1","男","123user");
    }
}
