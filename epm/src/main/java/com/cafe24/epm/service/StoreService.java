package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.epm.domain.Store;
import com.cafe24.epm.mapper.StoreMapper;

@Service
@Transactional
public class StoreService {
	
	@Autowired private StoreMapper storeMapper;
	
	//매장삭제처리
	public int storeDelete(String store_Name) {
		return storeMapper.storeDelete(store_Name);
	}
	
	//매장수정 전단계, 매장명 선택
	public Store getStoreSelect(String store_Name) {
		return storeMapper.getStoreSelect(store_Name);
	}
	
	//매장수정전단계_매장등록인원확인
	public List<Store> getstaffSelect(String store_Name) {
		return storeMapper.getstaffSelect(store_Name);
	}
	
	//수정처리
	public int storeUpdate(Store store) {
		Store result = storeMapper.getStoreSelect(store.getStore_Name());
		System.out.println("result.toString()--->"+result.toString());
		
		return storeMapper.storeUpdate(store);
	}
	
	//매장등록
	public int addStore(Store store) {
		System.out.println("===Store 서비스 시작===");
		return storeMapper.addStore(store);
	}
	
	//매장리스트
	public List<Store> storeList(){
		return storeMapper.storeList();
	}
	

}
