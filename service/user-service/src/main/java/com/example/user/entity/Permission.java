package com.example.user.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "permission")
public class Permission  extends BaseEntity {

    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 256)
    private String name;

}
