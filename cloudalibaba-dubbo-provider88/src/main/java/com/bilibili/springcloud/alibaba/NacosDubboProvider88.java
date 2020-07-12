package com.bilibili.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hanzhuofan
 * @create 2020-7-12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDubboProvider88 {
    public static void main(String[] args) {
        SpringApplication.run(NacosDubboProvider88.class, args);
    }
}
