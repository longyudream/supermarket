package com.czl.supermarket.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *整合mybatis-plus
 *     1、导入依赖
 *     2、配置
 *        一、配置数据源
 *              ①导入连接驱动
 *              ②配置数据源连接信息
 *         二、在配置mybatis-plus
 *              ①使用@MapperScan扫描mapper
 *              ②在配置文件中配置mapper.xml文件位置
 */
@MapperScan("com.czl.supermarket.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class SupermarketProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketProductApplication.class, args);
    }

}
