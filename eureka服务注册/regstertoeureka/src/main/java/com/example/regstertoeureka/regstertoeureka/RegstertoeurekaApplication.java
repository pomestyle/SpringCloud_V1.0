package com.example.regstertoeureka.regstertoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RegstertoeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegstertoeurekaApplication.class, args);
    }

}
