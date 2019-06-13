package com.lilu.feign.controller;

import com.lilu.feign.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lilu
 * @date ：2019/6/10 15:27
 * @description：test
 */
@RestController
@RequestMapping("feign")
public class HelloController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping("hello")
    public String getValue(){
        return helloClient.hello("猪猪猪");
    }

}
