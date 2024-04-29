package com.school.schoConnectapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SchoConnectAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoConnectAppApplication.class, args);
    }

}
