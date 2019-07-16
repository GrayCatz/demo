package com.example.zuul.mapper;


import com.example.zuul.domain.SysPermissionRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysPermissionRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysPermissionRole record);

    int insertSelective(SysPermissionRole record);

    SysPermissionRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysPermissionRole record);

    int updateByPrimaryKey(SysPermissionRole record);
}