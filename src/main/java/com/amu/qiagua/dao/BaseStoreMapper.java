package com.amu.qiagua.dao;

import org.apache.ibatis.annotations.Mapper;

import com.amu.qiagua.model.dobj.BaseStoreDO;

/**
 * BaseStoreMapper继承基类
 */
@Mapper
public interface BaseStoreMapper extends MyBatisBaseDao<BaseStoreDO, Long> {
	
}