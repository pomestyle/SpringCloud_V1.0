package com.example.eurekaclient.eurekaclient.fegin;


import com.example.eurekaclient.eurekaclient.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign是一种声明式、模板化的HTTP客户端。
 * Spring Cloud应用在启动时，Feign会扫描标有@FeignClient注解的接口，生成代理，并注册到Spring容器中
 * 生成代理时Feign会为每个接口方法创建一个RequetTemplate对象,该对象封装了HTTP请求需要的全部信息，
 * 请求参数名、请求方法等信息,如果是在用Spring Cloud Netflix搭建微服务，那么Feign无疑是最佳选择
 *
 */


//@FeignClient(value="user-server", fallback=HelloServiceImpl.class)  或者也可以指定返回的类，表明当前都是客户都是此返回类的接口
@FeignClient(value = "user-server")
public interface UserFeginInterface {

    //此处的url 必须和 @FeignClient 注解中指定的服务中访问的url一样
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    User getUser(@RequestParam("id") int id);


}
