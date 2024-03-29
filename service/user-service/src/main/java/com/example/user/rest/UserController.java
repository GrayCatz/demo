package com.example.user.rest;

import com.example.user.entity.User;
import com.example.user.entity.UserRole;
import com.example.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testBoot")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;


    @RequestMapping("test")
    public List<UserRole> test() {
        logger.debug("test:");
        return userService.test();
    }

    @RequestMapping("create")
    public User create() {
        logger.debug("create:");
        return userService.create();
    }

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id) {
        logger.debug("debut_test:");
        logger.info("debut_test:");
        return userService.Sel(id).toString();
    }
}
