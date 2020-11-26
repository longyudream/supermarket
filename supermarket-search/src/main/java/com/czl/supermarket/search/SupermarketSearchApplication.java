package com.czl.supermarket.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SupermarketSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketSearchApplication.class, args);
    }

}
