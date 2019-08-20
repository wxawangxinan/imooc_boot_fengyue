package com.fengyue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("redis_test")
    public String redisTest(){
        redisTemplate.opsForValue().set("imooc-cache","hello  imooc");
        String str = redisTemplate.opsForValue().get("imooc-cache").toString();
        return str;
    }
}
