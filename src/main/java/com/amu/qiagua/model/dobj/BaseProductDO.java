package com.amu.qiagua.model.dobj;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * base_product
 * @author 
 */
@Data
public class BaseProductDO implements Serializable {

	private static final long serialVersionUID = 6696616410526676040L;

	private Long id;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 该商品关联的分类的分类长编码, 关联base_category.category_long_id
     */
    private String categoryLongId;

    /**
     * 门店id, 关联base_store.id
     */
    private Long storeId;

    /**
     * 是否删除; 0: 默认未删除; 1: 已删除
     */
    private Byte isDeleted;

    /**
     * 这条信息在系统里面存活了多久(秒)
     */
    private Integer surviveTime;

    /**
     * 价格, ?元/斤, ?元/个, 单位分
     */
    private Integer price;

    /**
     * 单位类型, 1: ?元/斤, 2: ?元/个 3: 其他单位 
     */
    private Byte unitTypeValue;

    /**
     * 记录: 10元3个, 其他价格单位的信息
     */
    private String priceInfo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 商品备注
     */
    private String remark;

}