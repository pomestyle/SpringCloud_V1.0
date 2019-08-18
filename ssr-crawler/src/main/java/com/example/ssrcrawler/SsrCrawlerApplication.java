package com.example.ssrcrawler;

import com.example.ssrcrawler.pa.Pass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@Slf4j
public class SsrCrawlerApplication{

    @Autowired
    private Pass pas;

    public static void main(String[] args) {
        SpringApplication.run(SsrCrawlerApplication.class, args);
    }


    public void contextInitialized(ServletContextEvent sce) {

        log.info("开始启动爬虫！");
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("run " + System.currentTimeMillis());
                int i = pas.setSsr();

                if(i==1){
                    System.err.println("1 路径下文件存在异常，请检查文件ssr路径或文件;  \n 2 gui-config.json 文件中没有 configs 类型的json;\n 3 ssr文件不存在；");
                }

                //连接超时或者文件异常 重新爬取
                while (true){
                    System.err.println("60秒后 重新发起爬取！");
                    try {
                        //停留35s
                        Thread.sleep(1000*6);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(pas.setSsr()==2){
                        System.err.println("成功！");
                        break;
                    }

                }
            }
        }, 0, 24, TimeUnit.HOURS);
    }

}
