package com.cafe24.epm.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Store;

@Mapper
public interface StoreMapper {
	
	//매장등록
	public int addStore(Store store);

}
