package com.bilibili.springcloud.alibaba.impl;

import com.bilibili.springcloud.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author hanzhuofan
 * @date 2020/7/12
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
