package com.example.demo2.conotroller;

import com.example.demo2.config.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @Autowired
    private Environment env;
    @Autowired
    private DBConnector connector;

    @RequestMapping("/getPort")
    public String getPort() {
        String port = env.getProperty("server.port");
        System.out.println("server.port:" + port);
        return "server.port:" + port;
    }

    @RequestMapping("/showDB")
    public void showDB() {
        connector.configure();
    }
}