package com.example.demo2.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "consumer")
public class Consumer {

    private String username;

    private int age;


    private String[] hobby;

    private List subject;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List getSubject() {
        return subject;
    }

    public void setSubject(List subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return "Consumer{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                ", subject=" + subject +
                '}';
    }

}
