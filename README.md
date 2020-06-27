# Spring cloud 简单入门级示例


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

### 1 不使用eureka作为注册中心

    - springcloudconfigserver 服务端
        
        地址 
        
        http://127.0.0.1:5001/mysql-test/dev
        
        ```json
        {"name":"mysql-test","profiles":["dev"],"label":null,"version":"dce6a0b2f47a09a4a7779af2cb11180c8f396a7a","state":null,"propertySources":[{"name":"https://github.com/pomestyle/springcloud.git/springcloud-config/spring-config-server/mysql-test.properties","source":{"driverClassName":"com.mysql.jdbc.Driver","url":"jdbc:mysql://localhost:3306/db_app?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8","username":"root-test","password":"root-test"}}]}
        ```
    
    - springcloudconfigclient 客户端
        
        地址 
        
        127.0.0.1:5002/getMessage
        
        响应结果
        
        ```
        root
        ```

### 2 使用eureka作为注册中心

- spring-config-server 配置文件地址

    `mysql-dev.properties`
    `mysql-test.properties`

内容如下

    ```
    
    # 数据库驱动：
    driverClassName=com.mysql.jdbc.Driver
    # 数据库链接地址：
    url=jdbc:mysql://localhost:3306/db_app?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8
    #数据库用户名：
    username=root-test
    # 数据库密码： 
    password=root-test
    
    ```


- springcloud-eureka-configserver 服务端
    
    地址 
    
    http://127.0.0.1:5003/mysql-test/dev
    
    响应结果
    ```json
    {"name":"mysql-test","profiles":["dev"],"label":null,"version":"dce6a0b2f47a09a4a7779af2cb11180c8f396a7a","state":null,"propertySources":[{"name":"https://github.com/pomestyle/springcloud.git/springcloud-config/spring-config-server/mysql-test.properties","source":{"driverClassName":"com.mysql.jdbc.Driver","url":"jdbc:mysql://localhost:3306/db_app?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8","username":"root-test","password":"root-test"}}]}
    ```


- springcloud-client-configserver 客户端

地址 

127.0.0.1:5004/getMessage

响应结果

```
root-test
```

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

### zuui-filter

服务网关,拦截器非法请求



