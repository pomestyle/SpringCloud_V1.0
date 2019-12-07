package com.example.zuui.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.ZuulFilterInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: zuui 过滤器
 * @author: Administrator
 * @create: 2019-12-02 22:31
 **/
@Component
public class ZuuiFilter extends ZuulFilter {

    /**
     * 过滤器类型，可选值有 pre、route、post、error。
     * @return
     */
    @Override
    public String filterType() {
        System.out.println("前置请求");
        return "pre";
    }

    /**
     * 过滤器的执行顺序，数值越小，优先级越高。
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行该过滤器，true 为执行，false 为不执行，这个也可以利用配置中心来实现，达到动态的开启和关闭过滤器。
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }


    /**
     * 执行自己的业务逻辑，本段代码中是通过判断请求的 IP 是否在黑名单中，决定是否进行拦截。blackIpList 字段是 IP 的黑名单，判断条件成立之后，
     * 通过设置 ctx.setSendZuulResponse（false），告诉 Zuul 不需要将当前请求转发到后端的服务了。
     * 通过 setResponseBody 返回数据给客户端。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {

        RequestContext ctx = RequestContext.getCurrentContext();

        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response = ctx.getResponse();
        String token = request.getParameter("token");

        if(!"123".equals(token)){
            System.out.println("非法请求");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("非法请求！");
            ctx.getResponse().setContentType("application/json; charset=utf-8");
            return null;
        }

        System.out.println("验证通过");
        return null;
    }
}
