package com.amu.qiagua.model.dobj;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * base_store
 * @author 
 */
@Data
public class BaseStoreDO implements Serializable {

	private static final long serialVersionUID = -4159170349300944007L;

	private Long id;

    /**
     * 门店名称
     */
    private String storeName;

    /**
     * id连起来组成long code
     */
    private String areaLongId;

    /**
     * 门店图片id, 关联res_pic.id, 用逗号隔开
     */
    private String storePicIds;

    /**
     * 门店详细地址
     */
    private String storeAddressInfo;

    /**
     * 门店备注
     */
    private String remark;

    /**
     * 是否删除; 0: 默认未删除; 1: 已删除
     */
    private Byte isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

}