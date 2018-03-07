package com.chenyu.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.chenyu.base.BaseEntity;
import lombok.Data;

/**
 * 用户基本信息
 * @author chenyuyuyu
 */
@Data
@TableName("eims_user")
public class User extends BaseEntity {

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 角色类型
     */
    private String roleType;

    /**
     * 其他信息
     */
    private String otherInfo;


}
