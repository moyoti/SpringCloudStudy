package com.eurakaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurakaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakaclientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "uname", defaultValue = "dvalue") String name) {
        return "hi "+name+",port is "+port;
    }
    @RequestMapping("/sayhello")
    public String sayHello(@RequestParam(value = "hwords", defaultValue = "dwords") String words){
        return port+" say "+words;
    }
}
