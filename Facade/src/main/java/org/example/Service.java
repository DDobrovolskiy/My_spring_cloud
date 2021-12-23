package org.example;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Autowired
    private Transport transport;

    @GetMapping("/get")
    public String test() {
        return transport.getInstance(MyAPI.class).doMyAPI();
    }

}
