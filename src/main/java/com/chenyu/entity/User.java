package com.chenyu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.chenyu.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 用户基本信息
 *
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


    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private Date updateTime;

}
