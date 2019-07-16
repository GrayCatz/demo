package com.example.user.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

@Data
@Table(name = "user_role")
public class UserRole extends BaseEntity {
    @Column(name = "user_id", type = MySqlTypeConstant.INT, length = 11)
    private String userId;
    @Column(name = "role_id", type = MySqlTypeConstant.INT, length = 11)
    private String roleId;

}
