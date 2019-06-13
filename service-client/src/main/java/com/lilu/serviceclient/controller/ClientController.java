package com.lilu.serviceclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lilu
 * @date ：2019/6/10 13:47
 * @description：test
 */
@RestController
@RequestMapping("test")
public class ClientController {

    @RequestMapping("hello")
    public String hello(String str){
        return "Hello SpringCloud" + str;
    }

}
