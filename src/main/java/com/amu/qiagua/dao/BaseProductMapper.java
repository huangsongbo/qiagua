package com.amu.qiagua.dao;

import org.apache.ibatis.annotations.Mapper;

import com.amu.qiagua.model.dobj.BaseProductDO;

/**
 * BaseProductMapper继承基类
 */
@Mapper
public interface BaseProductMapper extends MyBatisBaseDao<BaseProductDO, Long> {
	
}