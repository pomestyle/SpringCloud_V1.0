package com.example.zuui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
// 开启服务器网关
@EnableZuulProxy
@SpringBootApplication
public class ZuuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuuiApplication.class, args);
    }

}
