package com.savor.springbootredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableCaching
@RestController
public class SpringbootredisApplication {

	@Autowired
	private RedisTemplate redisTemplate;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootredisApplication.class, args);
	}

	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public String testRedis(@RequestParam String key, @RequestParam String value){
		redisTemplate.opsForValue().set(key,value);
		return (String) redisTemplate.opsForValue().get(key);
	}
}
