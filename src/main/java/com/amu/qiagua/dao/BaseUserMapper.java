package com.amu.qiagua.dao;

import com.amu.qiagua.model.dobj.BaseUserDO;

import org.apache.ibatis.annotations.Mapper;

/**
 * BaseUserMapper继承基类
 */
@Mapper
public interface BaseUserMapper extends MyBatisBaseDao<BaseUserDO, Long> {
	
}