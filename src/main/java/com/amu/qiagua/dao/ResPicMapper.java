package com.amu.qiagua.dao;

import com.amu.qiagua.model.dobj.ResPicDO;

import org.apache.ibatis.annotations.Mapper;

/**
 * ResPicMapper继承基类
 */
@Mapper
public interface ResPicMapper extends MyBatisBaseDao<ResPicDO, Long> {
	
}