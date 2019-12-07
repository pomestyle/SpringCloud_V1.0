package com.example.eurekaserver.eurekaserver.controller;

import com.example.eurekaserver.eurekaserver.User;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("getUser")
    public  User getUser(  int id){
        return    new User(id,"name1","男","123user");
    }
}
