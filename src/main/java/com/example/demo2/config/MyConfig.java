package com.example.demo2.config;

import com.example.demo2.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public MyService myService(){
        return  new MyService();
    }
}

