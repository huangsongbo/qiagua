package com.amu.qiagua.model.dobj;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * res_pic
 * @author 
 */
@Data
public class ResPicDO implements Serializable {
	
	private static final long serialVersionUID = 1630624387392688678L;

	private Long id;

    /**
     * 图片路径
     */
    private String filePath;

    /**
     * 图片类型code
     */
    private String fileKey;

    /**
     * 图片大小(kb)
     */
    private Integer fileSize;

    /**
     * 图片像素-长
     */
    private Integer picLength;

    /**
     * 图片像素-宽
     */
    private Integer picWeight;

    /**
     * 是否删除; 0: 默认未删除; 1: 已删除
     */
    private Byte isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

}