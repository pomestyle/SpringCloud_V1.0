# Spring cloud 学习代码笔记



## eureka-server-6868

服务注册中心

## eureka-client 

客户端消费服务提供方

### 客户端  eureka-client-6870  

访问地址 ： 127.0.0.1:6870/getUser?id=123

### 服务端  eureka-client-6869

提供根据id查询user 

地址为 127.0.0.1:6869/getUser

参数为 id = ？

请求方式 get

  

## eureka-client-8080

Feign 熔断 断路由
ribbon 负载均衡
服务调用


## 分布式配置中心  spring cloud-config 

### 服务提供方
springcloudconfigserver-5002

配置从远端访问git读取配置文件

请求地址 

http://127.0.0.1:5001/mysql/dev 


### 消费方
springcloudconfigclient-5001

配置从远端访问git读取配置文件
http://127.0.0.1:5002/getMessage




## eureka-server-gky
eureka 高可用

端口为9001 和 9002 的两个服务互相注册



## zuui 

服务网关,拦截器



