package com.example.zuul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class AppRunner {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "dev");// 指定开发环境配置
        System.setProperty("spring.application.name", "zuul-service");// 应用日志名称
        SpringApplication.run(AppRunner.class, args);
    }
}
