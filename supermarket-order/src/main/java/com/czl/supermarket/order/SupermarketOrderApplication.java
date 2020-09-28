package com.czl.supermarket.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.czl.supermarket.order.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class SupermarketOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketOrderApplication.class, args);
    }

}
