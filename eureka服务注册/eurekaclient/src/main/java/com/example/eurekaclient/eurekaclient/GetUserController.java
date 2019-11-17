package com.example.eurekaclient.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * @description: 消费user服务
 * @author: Administrator
 * @create: 2019-11-06 22:46
 **/

@RestController
public class GetUserController {

    @Autowired
    RestTemplate restTemplate;

    //服务发现对象
    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("get")
    public User getUser(int id){
        //user微服务的名字 用来想此服务发送请求
        String  servceId = "user-server";

        String url = "http://" + servceId  + "/getUser?id=" + id;
        System.out.println(url +  " =  " +  url);
        User forObject = restTemplate.getForObject(url, User.class);


        return forObject;
    }

/*
    @RequestMapping("get")
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
    }*/


}
