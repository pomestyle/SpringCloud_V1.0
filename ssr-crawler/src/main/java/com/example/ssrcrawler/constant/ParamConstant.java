package com.example.ssrcrawler.constant;

/**
 * @description: 常量
 * @author: Administrator
 * @create: 2019-08-17 12:34
 **/
public class ParamConstant {
    /**
     * 需要爬取的ssr网站账号
     */
    public static  final String URl1 = "https://flywind.ml/free-ssr";

    /**
     * 需要爬取的高匿名网站账号
     */
    public static  final String URl2 = "http://www.66ip.cn/";
    /**
     * 设置浏览器头
     */
    public static  final String BROWSER_HEARD = "";

    final static String [] user_agents = new String[]{
                        "Mozilla/5.0 (Windows; U; Windows NT 5.1; it; rv:1.8.1.11) Gecko/20071127 Firefox/2.0.0.11",
                        "Opera/9.25 (Windows NT 5.1; U; en)",
                        "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)",
                        "Mozilla/5.0 (compatible; Konqueror/3.5; Linux) KHTML/3.5.5 (like Gecko) (Kubuntu)",
                        "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.8.0.12) Gecko/20070731 Ubuntu/dapper-security Firefox/1.5.0.12",
                        "Lynx/2.8.5rel.1 libwww-FM/2.14 SSL-MM/1.4.1 GNUTLS/1.2.9",
                        "Mozilla/5.0 (X11; Linux i686) AppleWebKit/535.7 (KHTML, like Gecko) Ubuntu/11.04 Chromium/16.0.912.77 Chrome/16.0.912.77 Safari/535.7",
                        "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:10.0) Gecko/20100101 Firefox/10.0"
    };

}
