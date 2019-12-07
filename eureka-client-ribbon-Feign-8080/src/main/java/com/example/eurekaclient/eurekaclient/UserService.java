package com.example.eurekaclient.eurekaclient;

import com.example.eurekaclient.eurekaclient.fegin.UserFeginInterface;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: Administrator
 * @create: 2019-11-18 23:21
 **/
@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    //服务发现对象
    @Autowired
    DiscoveryClient discoveryClient;


    @Autowired
    private UserFeginInterface userFeginInterface;


    /**
     * 使用 Hystrix  进行容错
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback1")
    public User getUser1(int id){

        //user微服务的名字 用来想此服务发送请求
        String  servceId = "user-server";

        String url = "http://" + servceId  + "/getUser?id=" + id;
        System.out.println(url +  " =  " +  url);
        User forObject = restTemplate.getForObject(url, User.class);

        return forObject;
    }

    /**
     * 使用Feign 客户端进行容错
     */
    @HystrixCommand(fallbackMethod = "fallback2")
    public User getUser2(int id){
        System.out.println(2);
        return userFeginInterface.getUser(id);
    }




    /**
     * 使用@HystrixCommand注解指定当该方法发生异常时调用的方法
     * @param id id
     * @return 通过id查询到的用户
     */
    public User fallback1(int id) {
        return new User(id,"test 用户 ","查询用户异常！","1");
    }


    public User fallback2(int id) {
        return new User(id,"test 用户 ","查询用户异常！","1");
    }


}
