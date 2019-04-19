package com.servicefeign.feignservice;

import org.springframework.stereotype.Component;

/**
 * @Author: dongqihang
 * @Date: Created in 14:16 2019/4/18
 */
@Component
public class HystricDemo implements SchualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return name+" error";
    }

    @Override
    public String sayHelloFromClient(String words) {
        return words+" say hello error";
    }
}
