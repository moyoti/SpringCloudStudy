package com.springconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringconfigdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringconfigdemoApplication.class, args);
	}

}
