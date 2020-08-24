package com.demo.data.controller;

import com.demo.data.feign.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author demo
 * @Date 2020/8/7 11:11
 * @Version 1.0
 */
@RestController
@RequestMapping(("/user"))
public class ArticleController extends BaseController{


    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/callHello")
    public String callHello() {
        String result = userRemoteClient.hello();
        System.out.println("调用结果：" + result);
        return result;
    }
}
