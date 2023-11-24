package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // эта аннотац заменяет @Configuration , @EnableAutoConfiguration,  @ComponentScan!!!!
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    //делаем коммит в мэйн ветке (мастер)

    // теперь мы переключились на ветку тестБранч и делаем еще запись

    // еще одна запись в тестбранч
}
