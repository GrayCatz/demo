package com.example.user.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test() {
        return "测试111";
    }
}
