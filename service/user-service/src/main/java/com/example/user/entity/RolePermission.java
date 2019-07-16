package com.example.user.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

@Data
@Table(name = "role_permission")
public class RolePermission extends BaseEntity {
    @Column(name = "role_id", type = MySqlTypeConstant.INT, length = 11)
    private String roleId;
    @Column(name = "permission_id", type = MySqlTypeConstant.INT, length = 11)
    private String permissionId;

}
