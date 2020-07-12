package com.bilibili.springcloud.alibaba.controller;

import com.bilibili.springcloud.api.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanzhuofan
 * @create 2020-7-12
 */
@RestController
@Slf4j
public class DubboConsumerController {
    @Reference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello("Dubbo!");
    }

}
