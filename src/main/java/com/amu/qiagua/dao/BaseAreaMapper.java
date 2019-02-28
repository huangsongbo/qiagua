package com.amu.qiagua.dao;

import org.apache.ibatis.annotations.Mapper;

import com.amu.qiagua.model.dobj.BaseAreaDO;

/**
 * BaseAreaMapper继承基类
 */
@Mapper
public interface BaseAreaMapper extends MyBatisBaseDao<BaseAreaDO, Long> {
	
}