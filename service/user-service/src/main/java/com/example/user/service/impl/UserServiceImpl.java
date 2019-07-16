package com.example.user.service.impl;

import com.example.user.entity.User;
import com.example.user.entity.UserRole;
import com.example.user.mapper.UserMapper;
import com.example.user.mapper.UserRoleMapper;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserRoleMapper userRoleMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }

    public User create() {
        User user = new User();
        user.setUsername("yezhijian");
        user.setPassword("y1103038194");
        user.setRealName("叶志建");
        int insert = userMapper.insert(user);
        return user;
    }

    public List<UserRole> test() {
        List<UserRole> userRoles = userRoleMapper.selectUserWithRoles(1);
        return userRoles;
    }
}
