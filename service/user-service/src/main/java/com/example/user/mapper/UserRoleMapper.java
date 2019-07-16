package com.example.user.mapper;

import com.example.user.IBaseDao;
import com.example.user.entity.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleMapper extends IBaseDao<UserRole> {
    List<UserRole> selectUserWithRoles(Integer userId);

    UserRole Sel(int id);
}