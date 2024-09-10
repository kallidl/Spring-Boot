package com.example.demo2.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("pro")
public class ProDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("pro数据库配置环境");
    }
}