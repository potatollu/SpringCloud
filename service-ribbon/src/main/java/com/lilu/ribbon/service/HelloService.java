package com.lilu.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：lilu
 * @date ：2019/6/10 17:49
 * @description：test
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService(String str) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/test/hello?str="+str,String.class);
    }


}
