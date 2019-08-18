package com.example.ssrcrawler.constant;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.BrowserVersionFeatures;

import static com.gargoylesoftware.htmlunit.BrowserVersion.*;

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
    public static  final String URl3 = "https://www.youneed.win/free-ssr";

    /**
     * 需要爬取的高匿名网站账号
     */
    public static  final String URl2 = "http://www.66ip.cn/";
    /**
     * 设置浏览器头
     */
    public static  final String BROWSER_HEARD = "";

    public final static BrowserVersion [] user_agents = new BrowserVersion[]{
            FIREFOX_45,
            FIREFOX_52,
            INTERNET_EXPLORER,
            CHROME,
            EDGE
    };

}
