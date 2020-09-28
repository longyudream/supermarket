package com.czl.supermarket.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.czl.supermarket.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class SupermarketMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketMemberApplication.class, args);
    }

}
