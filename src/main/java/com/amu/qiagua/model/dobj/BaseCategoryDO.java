package com.amu.qiagua.model.dobj;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * base_category
 * @author 
 */
@Data
public class BaseCategoryDO implements Serializable {
	
	private static final long serialVersionUID = 7232697108462311138L;

	private Long id;

    /**
     * 父id, 关联base_category.id
     */
    private Long pid;

    /**
     * id连起来组成long code
     */
    private String categoryLongId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类图片id, 关联res_pic.id
     */
    private Long categoryPicId;

    /**
     * 排序用的点击量
     */
    private Integer clickRate;

    /**
     * 是否删除; 0: 默认未删除; 1: 已删除
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * level
     */
    private Integer level;

}