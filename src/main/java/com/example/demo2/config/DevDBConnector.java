package com.example.demo2.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDBConnector implements DBConnector{
    @Override
    public void configure() {
        System.out.println("dev数据库配置环境");
    }
}
