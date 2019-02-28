package com.amu.qiagua.dao;

import org.apache.ibatis.annotations.Mapper;

import com.amu.qiagua.model.dobj.BaseCategoryDO;

/**
 * BaseCategoryMapper继承基类
 */
@Mapper
public interface BaseCategoryMapper extends MyBatisBaseDao<BaseCategoryDO, Long> {
	
}