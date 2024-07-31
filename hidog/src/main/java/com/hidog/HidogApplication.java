package com.hidog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HidogApplication {

    public static void main(String[] args) {
        SpringApplication.run(HidogApplication.class, args);
    }

}
