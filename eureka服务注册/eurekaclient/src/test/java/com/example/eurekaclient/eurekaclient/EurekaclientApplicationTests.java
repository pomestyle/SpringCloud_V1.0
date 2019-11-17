package com.example.eurekaclient.eurekaclient;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

@SpringBootTest
class EurekaclientApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 单元测试
     */

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Test
    public void tests(){


        for (int i = 0; i < 100; i++) {

            ServiceInstance choose = loadBalancerClient.choose("user-server");
            System.out.println("第 " + (i+1) + "次 执行 " +  choose.getPort() + choose.getUri());
        }
    }
}
