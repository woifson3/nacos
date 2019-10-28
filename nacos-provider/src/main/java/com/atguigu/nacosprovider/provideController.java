package com.atguigu.nacosprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provide")
public class provideController {
    @Value("${myname}")//从配置文件中（就是nacos配置中心）拿到的key值,
    private String name;

    @Value("${Test.properties}")//再获取一个配置参数
    private String name01;

    @GetMapping("hello")
    public String hello(){
        return "hello,I'm provide"+this.name+name01;
    }
}
