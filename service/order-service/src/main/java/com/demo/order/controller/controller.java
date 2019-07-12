package com.demo.order.controller;

import com.demo.order.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @Autowired
    private UserService userService;

    @RequestMapping("/test/test_rest")
    private String test() {
        String test = userService.test();
        System.out.println("test:" + test);
        return test;
    }
}
