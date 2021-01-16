package com.black.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class User3002Application {

    public static void main(String[] args) {
        SpringApplication.run(User3002Application.class, args);
        System.out.println("启动完成");
    }


}
