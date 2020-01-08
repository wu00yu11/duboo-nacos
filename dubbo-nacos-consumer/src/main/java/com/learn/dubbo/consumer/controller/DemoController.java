package com.learn.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.learn.dubbo.nacos.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dubbo-nacos
 * @description:
 * @author: zjj
 * @create: 2020-01-08 16:15
 **/
@RestController
@Slf4j
@RequestMapping("/demo")
public class DemoController {

    @Reference(interfaceName = "demoService")
    private DemoService demoService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
            log.info("this is hello method");
        return   demoService.sayHello("hello, where are you?");
    }


}
