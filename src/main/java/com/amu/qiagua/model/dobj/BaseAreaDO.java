package com.amu.qiagua.model.dobj;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * base_area
 * 
 * @author huangsongbo
 */
@Data
public class BaseAreaDO implements Serializable {
	
	private static final long serialVersionUID = 3702962270436034431L;

	private Long id;

    /**
     * 父id, 关联base_area.id
     */
    private Long pid;

    /**
     * id连起来组成long code
     */
    private String areaLongId;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 是否删除; 0: 默认未删除; 1: 已删除
     */
    private Byte isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

}