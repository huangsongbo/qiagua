package com.amu.qiagua.model.dobj;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * base_user
 * @author 
 */
@Data
public class BaseUserDO implements Serializable {

	private static final long serialVersionUID = 1704224124665428933L;

	private Long id;

    /**
     * 用户类型; 来自微信/web后台管理员...
     */
    private String userType;

    /**
     * 权限类型, eg: 产品更新/后台管理
     */
    private String permissionType;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 来源于微信用户的openId
     */
    private String openId;

    /**
     * 是否删除; 0: 默认未删除; 1: 已删除
     */
    private Byte isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

}