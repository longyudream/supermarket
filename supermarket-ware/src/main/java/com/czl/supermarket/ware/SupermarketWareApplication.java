package com.czl.supermarket.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SupermarketWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketWareApplication.class, args);
    }

}
