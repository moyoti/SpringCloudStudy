package com.servicefeign.Controller;

import com.servicefeign.feignservice.SchualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dongqihang
 * @Date: Created in 17:11 2019/4/17
 */
@RestController
public class HiController {
    @Autowired
    SchualServiceHi schualServiceHi;
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String uname){
        return schualServiceHi.sayHiFromClientOne(uname);
    }
    @GetMapping(value = "/sayhello")
    public String sayHello(@RequestParam String words){
        return schualServiceHi.sayHelloFromClient(words);
    }
}
