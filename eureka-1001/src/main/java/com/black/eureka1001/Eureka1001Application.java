package com.black.eureka1001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka1001Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka1001Application.class, args);
    }

}
