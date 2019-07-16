package com.example.zuul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@MapperScan("com.example.zuul.mapper") //扫描的mapper
public class AppRunner {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "dev");// 指定开发环境配置
        System.setProperty("spring.application.name", "zuul-service");// 应用日志名称
        SpringApplication.run(AppRunner.class, args);
    }
}
