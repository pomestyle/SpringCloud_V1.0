package com.example.eurekaclient.eurekaclient;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//开启熔断器
@EnableHystrix
@EnableFeignClients //开启Feign 熔断器
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaclientApplication {

    /**
     * 实例化RestTemplate，通过@LoadBalanced注解开启均衡负载能力.
     * @return restTemplate
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class, args);
    }

/*
    @Bean
    public IRule myRule(){
        return new RoundRobinRule();//轮询
        //return new RetryRule();//重试
        //return new BestAvailableRule();
    }*/

}
