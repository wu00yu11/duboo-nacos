package com.learn.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.learn.dubbo.nacos.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @program: dubbo-nacos
 * @description:
 * @author: zjj
 * @create: 2020-01-08 15:30
 **/
@Slf4j
@Component
@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name) {
        log.info("hello, this is provider's home, can I help you?");
        return "hello, this is provider's home, can I help you?";
    }
}


