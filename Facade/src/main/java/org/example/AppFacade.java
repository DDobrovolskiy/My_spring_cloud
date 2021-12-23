package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class AppFacade {
    public static void main(String[] args) {
        SpringApplication.run(AppFacade.class, args);

        Transport transport = new Transport();
        MyAPI myAPI = transport.getInstance(MyAPI.class);
        System.out.println(myAPI.doMyAPI());
        //myAPI.doMyAPI2();
    }
}
