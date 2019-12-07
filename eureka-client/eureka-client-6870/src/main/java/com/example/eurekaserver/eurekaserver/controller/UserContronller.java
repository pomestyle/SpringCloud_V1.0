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


    @RequestMapping("getUser")
    public User getUser(int id){
        //user微服务的名字 用来想此服务发送请求

        //获取实例 通过服务id 也就是服务名字
        List<ServiceInstance> instances = this.discoveryClient.getInstances("USER_SERVER");
        if(instances.isEmpty()){
            return null;
        }
        //这里获取一个实例  多个循环
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort()  + "/getUser?id=" + id;
        System.out.println(url +  " =  " +  url);
        User forObject = restTemplate.getForObject(url, User.class);
        return forObject;
    }
}
