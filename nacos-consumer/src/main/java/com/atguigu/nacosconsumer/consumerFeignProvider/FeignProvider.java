package com.atguigu.nacosconsumer.consumerFeignProvider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-provider")//指定需要调用的是哪个服务
public interface FeignProvider {
    @GetMapping("provide/hello")//provider的映射地址是两层，要写全
    public String hello();

}
