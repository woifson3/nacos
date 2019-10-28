package com.atguigu.nacosconsumer.controller;

import com.atguigu.nacosconsumer.consumerFeignProvider.FeignProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //配置的注解
public class consumerController {
    @Autowired//要是写上这个注解报错，Could not autowire. No beans of 'xxxx' type found可以收解决办法，修改erro到warning
    FeignProvider f;

    @GetMapping("hi")
    public String hi() {
        String hello = f.hello();
        return "没错，我就是消费者========" + hello;
    }
}
