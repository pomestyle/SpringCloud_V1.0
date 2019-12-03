package com.example.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//启用configServer
@EnableConfigServer
//启用eurekaServer 服务端
@EnableEurekaServer
//启用eurekaClient 客户端
@EnableDiscoveryClient

@SpringBootApplication
public class SpringcloudconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconfigserverApplication.class, args);
	}

}
