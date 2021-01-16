package com.black.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class User3001Application {

    public static void main(String[] args) {
        SpringApplication.run(User3001Application.class, args);
        System.out.println("启动完成");
    }


}
