package com.cafe24.epm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.epm.domain.Store;
import com.cafe24.epm.mapper.StoreMapper;

@Service
@Transactional
public class StoreService {
	
	@Autowired private StoreMapper storeMapper;
	
	//매장등록
	public int addStore(Store store) {
		System.out.println("===Store 서비스 시작===");
		return storeMapper.addStore(store);
	}

}
