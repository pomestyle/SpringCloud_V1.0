package com.example.springcloudconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class SpringcloudconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudconfigserverApplication.class, args);
    }

    @Value("${password}")
    private String password;

    @GetMapping("/getMessage")
    public String getPassword() {
        System.out.println("password =  " + password);
        return this.password;
    }


}
