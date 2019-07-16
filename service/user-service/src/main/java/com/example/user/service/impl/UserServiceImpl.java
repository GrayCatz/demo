package com.example.user.service.impl;

import com.example.user.entity.User;
import com.example.user.mapper.UserMapper;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }

    public User create() {
        User user = new User();
        user.setUserName("yezhijian");
        user.setPassWord("y1103038194");
        user.setRealName("叶志建");
        int insert = userMapper.insert(user);
        return user;
    }
}
