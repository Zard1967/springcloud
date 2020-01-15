package com.tan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.tan.mapper")
@EnableEurekaClient//启动后 服务自动注册在注册中心
@EnableDiscoveryClient//服务发现
public class StartApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication8001.class, args);
    }
}