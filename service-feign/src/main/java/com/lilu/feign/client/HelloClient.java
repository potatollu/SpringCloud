package com.lilu.feign.client;

import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "service-client", fallbackFactory = HelloClientFactory.class)
public interface HelloClient {

    @RequestMapping(value = "test/hello", method = RequestMethod.GET)
    String hello(@RequestParam("str") String str);
}

@Component
class HelloClientFactory implements FallbackFactory<HelloClient> {

    @Override
    public HelloClient create(Throwable throwable) {
        return new HelloClient() {
            @Override
            public String hello(String str) {
                return "use hystrix";
            }
        };
    }
}
