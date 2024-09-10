package com.example.demo2;

import com.example.demo2.domain.Consumer;
import com.example.demo2.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class Demo2ApplicationTests {

    @Autowired
    private Consumer consumer;

    @Autowired
    private Environment env;

    @Autowired
    private User user;

    @Test
    void wiredTest() {
        System.out.println(consumer);
    }


    @Test
    void evnTest() {
        System.out.println("consumer.username=" + env.getProperty("consumer.username"));
        System.out.println("consumer.age=" + env.getProperty("consumer.age"));
        System.out.println("consumer.hobby=" + env.getProperty("consumer.hobby"));
        System.out.println("consumer.subject=" + env.getProperty("consumer.subject"));
    }

    @Test
    void confTest() {
        System.out.println(consumer);
    }
    @Test
    void propTest() {
        System.out.println(user);
    }

}
