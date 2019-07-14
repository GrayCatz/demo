package com.example.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.example.user.mapper") //扫描的mapper
public class AppRunner {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev");// 指定开发环境配置
        System.setProperty("spring.application.name", "user-service");// 应用日志名称
        SpringApplication.run(AppRunner.class, args);
    }
}
