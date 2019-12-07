package com.example.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//启用configServer
@EnableConfigServer
@SpringBootApplication
public class SpringcloudconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudconfigserverApplication.class, args);
    }

}
