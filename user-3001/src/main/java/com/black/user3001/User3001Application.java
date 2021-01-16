package com.black.user3001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
public class User3001Application {

    public static void main(String[] args) {
        SpringApplication.run(User3001Application.class, args);
    }

}
