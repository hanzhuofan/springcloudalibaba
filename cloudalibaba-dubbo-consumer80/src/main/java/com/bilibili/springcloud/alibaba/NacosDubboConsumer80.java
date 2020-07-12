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
public class NacosDubboConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(NacosDubboConsumer80.class, args);
    }
}
