package com.example.pro1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
@SuppressWarnings("all")

public class DemoApplication {
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

    }

}
