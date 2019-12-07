package com.example.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringcloudconfigclientApplication {

    @Value("${password}")
    private String password;

    @GetMapping("/getMessage")
    public String getPassword() {
        System.out.println("password =  " + password);
        return this.password;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringcloudconfigclientApplication.class, args);
    }

}
