package com.example.ssrcrawler.pa;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.ssrcrawler.constant.ParamConstant;
import com.example.ssrcrawler.util.FileUtil;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import pojo.Ssr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;


/**
 * @description: 爬取ssr网站账号
 * @author: Administrator
 * @create: 2019-08-17 12:38
 **/

@Slf4j
@Component
public class Pass {

    @Value("${ssr.sum}")
    private int sum;

    @Value("${ssr.path}")
    private String path;


    public int setSsr() {
        System.out.println(" 【 ssr 地址 是 】" + path);
        System.out.println(" 【 最大设置ssr 账号数量 是 】" + sum);
        HtmlPage htmlPage = getHtmlPage(ParamConstant.URl3);
        if (htmlPage == null) {
            System.err.println("连接超时！");
            return 0;
        }
        String s = htmlPage.asXml();
        Document parse = Jsoup.parse(s);
        //获取 panel 的div 元素
        Elements tr = parse.getElementsByClass("panel");
        tr = parse.getElementsByTag("tbody");
        //获取第一个 元素中tbody元素也就是tr 即ssr账号
        Elements element1 = tr.get(0).getElementsByTag("tbody");
        //ssr账号
        /**
         *      <th align="center"> ssr链接 </th>
         *     <th align="center"> IP </th>
         *     <th align="center"> 端口 </th>
         *     <th align="center"> 密码 </th>
         *     <th align="center"> 加密 </th>
         *     <th align="center"> 协议 </th>
         *     <th align="center"> 混淆 </th>
         */
        List<Ssr> list = new ArrayList<>();
        element1.forEach(element -> {
            Elements td = element.getElementsByTag("tr");
            for (int i = 0; i < td.size(); i++) {
                Elements td1 = td.get(i).getElementsByTag("td");
                String ip = td1.get(1).text();
                String port = td1.get(2).text();
                String pwd = td1.get(3).text();
                String jm = td1.get(4).text();
                String xy = td1.get(5).text();
                String hx = td1.get(6).text();
                Ssr ssr = new Ssr(ip, port, pwd, jm, xy, hx);
                list.add(ssr);
            }
        });

        list.forEach(ssr -> log.info("【 爬取到的ssr 账号 -- >】{}", ssr));
        String jsonString = JSON.toJSONString(list);
        log.info("------- 开始写入配置文件------");
        File file = new File(path);
        File[] list1 = file.listFiles();
        if (list1 == null || list1.length == 0) {
            System.err.println("非法操作，无任何文件！");
            return 1;
        }
        AtomicBoolean falg = new AtomicBoolean(false);
        Arrays.asList(list1).forEach(s1 -> {
            log.info(s1.getName());
            if ("gui-config.json".equals(s1.getName())) {
                falg.set(true);
            }
        });
        if (!falg.get()) {
            System.err.println(path + " 路径下不存在 gui-config.json！");
            return 1;
        }
        return setFile(list);

    }


    public int setFile(List<Ssr> list) {
        FileReader fileReader = null;
        String s1 = null;
        try {
            fileReader = new FileReader(path);
            s1 = FileUtil.fileReader(fileReader);
            if (StringUtils.isEmpty(s1)) {
                System.err.println("文件不能为空。");
                return 1;
            }
            JSONObject jsonObject = JSONObject.parseObject(s1);
            if (jsonObject == null) {
                System.err.println("文件不能为空。");
                return 1;
            }

            boolean configs = jsonObject.containsKey("configs");
            if (!configs) {
                log.info("【 gui-config.json 文件中没有 configs 类型的json 】");
                return 1;
            }
            //为选择ssr账号数量 不配置或者大于90，则默认写10个
            if (sum == 0 || sum > 90) {
                sum = 10;
            }
            String jsonStr = JSONObject.toJSONString(list.stream().limit(sum));
            //更新账号
            jsonObject.put("configs", jsonStr);
            //写入ssr账号到本地文件
            log.info("--------------- 正在设置ssr账号--------------");
            FileUtil.writeFile(jsonObject.toJSONString(), path);
            log.info("---------------设置成功--------------");
        } catch (FileNotFoundException e) {
            System.err.println("未发现文件！");
            return 1;
        } catch (IOException e) {
            System.err.println("链接超时！");
            e.printStackTrace();
            return 0;
        }
        return 2;
    }

    /**
     * 获取HtmlPage 实例
     *
     * @return
     */
    public static HtmlPage getHtmlPage(String url) {
        int i = (int) Math.random() * 5 + 1;
        BrowserVersion browserVersions = ParamConstant.user_agents[i];
        WebClient webClient = new WebClient(browserVersions);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setActiveXNative(false);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setThrowExceptionOnScriptError(true);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setTimeout(30000);

        HtmlPage htmlPage = null;
        try {
            htmlPage = webClient.getPage(url);
            //js执行完成后 在获取网页实例
            webClient.waitForBackgroundJavaScript(10000);
            return htmlPage;
        } catch (Exception e) {
            System.err.println("链接超时，请稍后再试！");
            e.printStackTrace();
        } finally {
            webClient.close();
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        sssss();
    }


    public static void sssss() throws Exception {

        CloseableHttpClient httpClient = HttpClients.createDefault(); // 创建httpClient实例

        HttpGet httpGet = new HttpGet(ParamConstant.URl3); // 创建httpget实例
        HttpHost proxy = new HttpHost("115.28.148.192", 8118);
        RequestConfig config = RequestConfig.custom().setProxy(proxy)
                .setConnectTimeout(10000) // 设置连接超时时间 10秒钟
                .setSocketTimeout(20000) // 设置读取超时时间10秒钟
                .build();
        httpGet.setConfig(config);
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");
        CloseableHttpResponse response = httpClient.execute(httpGet); // 执行http get请求
        HttpEntity entity = response.getEntity(); // 获取返回实体
        System.out.println("网页内容：" + EntityUtils.toString(entity, "utf-8")); // 获取网页内容
        response.close(); // response关闭
        httpClient.close(); // httpClient关闭
    }
}