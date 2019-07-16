package com.example.user.mapper;

import com.example.user.IBaseDao;
import com.example.user.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends IBaseDao<User> {

    User Sel(int id);
}