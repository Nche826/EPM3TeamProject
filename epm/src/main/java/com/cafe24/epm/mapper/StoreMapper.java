package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Store;

@Mapper
public interface StoreMapper {
	
	
	//매장 수정
	public int storeUpdate(Store store);
	
	//매장수정전단계
	public Store getStoreSelect(String store_Name);
	
	//매장등록
	public int addStore(Store store);
	
	//매장리스트
	public List<Store> storeList();

}
