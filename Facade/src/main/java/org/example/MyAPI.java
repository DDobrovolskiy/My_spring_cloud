package org.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@API
@FeignClient("service")
public interface MyAPI {
    @RequestMapping("/info")
    String doMyAPI();

    @RequestMapping("/info2")
    String doMyAPI2();
}
