package com.tan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//开启eureka server服务，可以接受注册
public class StartApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication7002.class, args);
    }
}