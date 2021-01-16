package com.black.gateway4001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Gateway4001Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway4001Application.class, args);
    }

}
