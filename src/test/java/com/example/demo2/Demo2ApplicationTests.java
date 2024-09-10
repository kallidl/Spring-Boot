package com.example.demo2;

import com.example.demo2.domain.Consumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ApplicationTests {

    @Autowired
    private Consumer consumer;


    @Test
    void wiredTest() {
        System.out.println(consumer);
    }

}
