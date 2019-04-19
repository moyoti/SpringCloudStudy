package com.servicefeign.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: dongqihang
 * @Date: Created in 17:09 2019/4/17
 */
@FeignClient(value = "service-hi",fallback = HystricDemo.class)
public interface SchualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "uname") String name);
    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    String sayHelloFromClient(@RequestParam(value = "hwords") String words);
}
