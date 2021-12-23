package org.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class MyAPIimpl implements MyAPI {

    @Override
    public String doMyAPI() {
        return "test2";
    }

    @Override
    public String check() {
        return "true";
    }
}
