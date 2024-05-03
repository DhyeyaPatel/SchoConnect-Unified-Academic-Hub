package com.school.schoConnectapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@ComponentScan
public class SchoConnectAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoConnectAppApplication.class, args);
    }

}
