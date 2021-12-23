package org.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@API
@RestController
public interface MyAPI {
    @RequestMapping("org.example.MyAPI/doMyAPI")
    String doMyAPI();

    @RequestMapping("info")
    String check();
}
