package cn.qyd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @Author qyd
 * @Date 18-12-27 上午11:58
 **/
@SpringBootApplication
@EnableZipkinServer
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
