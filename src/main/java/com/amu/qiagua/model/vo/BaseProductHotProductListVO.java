package com.amu.qiagua.model.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseProductHotProductListVO implements Serializable {

	private static final long serialVersionUID = -8464578152382328472L;

	/**
	 * 分类图片地址
	 */
	private String categoryPicPath;
	
	/**
	 * 价格信息
	 */
	private String priceInfo;
	
	/**
	 * 街道信息
	 */
	private String streetInfo;
	
	/**
	 * 超市名称
	 */
	private String storeName;
	
	/**
	 * 分类名称
	 */
	private String categoryName;
	
	/**
	 * 商品信息更新时间
	 */
	private Date updateTime;
	
}
