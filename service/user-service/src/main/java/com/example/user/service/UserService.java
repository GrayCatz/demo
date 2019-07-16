package com.example.user.service;

import com.example.user.entity.User;
import com.example.user.entity.UserRole;

import java.util.List;

public interface UserService {

    User Sel(int id);

    User create();

    List<UserRole> test();
}
