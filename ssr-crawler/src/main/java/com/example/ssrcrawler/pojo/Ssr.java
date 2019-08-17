package pojo;

import lombok.Data;
import lombok.ToString;

/**
 * @description: ssr 实体类
 * @author: Administrator
 * @create: 2019-08-17 16:31
 **/
@Data
@ToString
public class Ssr {

    private String ip;
    private String port;
    private String pwd;
    /**
     * 加密
     */
    private String jm;
    /**
     * 协议
     */
    private String xy;
    /**
     * 混淆
     */
    private String hx;

    public Ssr(String ip, String port, String pwd, String jm, String xy, String hx) {
        this.ip = ip;
        this.port = port;
        this.pwd = pwd;
        this.jm = jm;
        this.xy = xy;
        this.hx = hx;
    }
}
