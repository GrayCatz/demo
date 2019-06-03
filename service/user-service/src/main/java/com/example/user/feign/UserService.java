package com.example.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user-service")
public interface UserService {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    void test();
}
