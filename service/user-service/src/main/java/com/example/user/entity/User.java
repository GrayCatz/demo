package com.example.user.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

@Data
@Table(name = "user")
public class User extends BaseEntity {
    @Column(name = "username", type = MySqlTypeConstant.VARCHAR, length = 256)
    private String username;
    @Column(name = "real_name", type = MySqlTypeConstant.VARCHAR, length = 256)
    private String realName;
    @Column(name = "password", type = MySqlTypeConstant.VARCHAR, length = 256)
    private String password;

}
