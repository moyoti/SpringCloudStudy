package com.eurekaribbon.controller;

import com.eurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dongqihang
 * @Date: Created in 16:38 2019/4/17
 */
@RestController
public class HiController {
    @Autowired
    HelloService helloService;
    @GetMapping(value = "/hi")
    public String hiCon(@RequestParam String name){
        return helloService.helloSerivce(name);
    }
}
