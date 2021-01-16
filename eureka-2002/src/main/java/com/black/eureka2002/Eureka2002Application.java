package com.black.eureka2002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka2002Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka2002Application.class, args);
    }

}
