package com.simon.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
