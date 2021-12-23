package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class AppService {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        SpringApplication.run(AppService.class, args);
    }
}
