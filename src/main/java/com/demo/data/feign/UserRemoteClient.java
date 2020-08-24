package com.demo.data.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description TODO
 * @Author demo
 * @Date 2020/8/7 15:20
 * @Version 1.0
 */
@FeignClient(name = "eureka-client-user-service",  fallbackFactory = UserRemoteClientFallbackFactory.class)
public interface UserRemoteClient {

    @GetMapping("/user/hello")
    String hello();

}
