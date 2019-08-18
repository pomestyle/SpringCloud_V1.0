package com.example.ssrcrawler;

import com.example.ssrcrawler.pa.Pass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Administrator
 * @create: 2019-08-17 23:15
 **/
@Component
public class StartConfig implements ApplicationRunner {
    @Autowired
    private Pass pass;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("run " + System.currentTimeMillis());
        int i = pass.setSsr();

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
            if(pass.setSsr()==2){
                System.err.println("成功！");
                break;
            }

        }
    }
}
