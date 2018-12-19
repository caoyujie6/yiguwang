package com.example.demo22222;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //boot开启定时任务注解
public class Demo22222Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo22222Application.class, args);
    }

}

