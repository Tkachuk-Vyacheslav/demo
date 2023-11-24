package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // эта аннотац заменяет @Configuration , @EnableAutoConfiguration,  @ComponentScan!!!!
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //testBranch commit
    //plus second linegit br
}
