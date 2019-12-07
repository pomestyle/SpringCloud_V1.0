package com.example.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//启用configServer
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudconfigserverApplication.class, args);
    }

}
