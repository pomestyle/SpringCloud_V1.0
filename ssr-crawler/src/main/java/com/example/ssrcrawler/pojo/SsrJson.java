package pojo;

import lombok.Data;

import java.util.UUID;

/**
 * @description: 要写入ssr客户端配置问价ssr账号 实体
 * @author: Administrator
 * @create: 2019-08-17 17:03
 **/

@Data
public class SsrJson {


    public String remarks = "";//""


    public String id = UUID.randomUUID().toString(); //554D9E77978A61B0CDE370F603885977  这里用uuid


    public String server;


    public int server_port;


    public int server_udp_port = 0;//0


    public String password;


    public String method;


    public String protocol;


    public String protocolparam = ""; // 配置文件里面为""


    public String obfs;


    public String obfsparam = "";// 配置文件里面为""


    public String remarks_base64 = "";// 配置文件里面为""


    public String group = "";// 配置文件里面为""


    public boolean enable = true;//true


    public boolean udp_over_tcp;//false
}
