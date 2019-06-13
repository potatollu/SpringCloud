package com.lilu.ribbon.controller;

import com.lilu.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lilu
 * @date ：2019/6/10 17:50
 * @description：test
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello")
    public String hi(@RequestParam String name) {
        return helloService.helloService( name );
    }
}



