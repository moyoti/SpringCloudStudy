package com.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: dongqihang
 * @Date: Created in 16:23 2019/4/17
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    public String helloSerivce(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?uname="+name,String.class);
    }
}
