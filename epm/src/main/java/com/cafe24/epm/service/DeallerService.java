package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Dealler;
import com.cafe24.epm.mapper.DeallerMapper;

@Service
public class DeallerService {
	@Autowired private DeallerMapper deallerMapper;
	//거래처 등록
	public int deallerInsert(Dealler dealler) {
		System.out.println("DeallerInsert Service");
		return deallerMapper.deallerInsert(dealler);
	}
	
	//거래처 리스트
	public List<Dealler> deallerList() {
		System.out.println("DeallerList Service");
		return deallerMapper.deallerList();
	}
	
	//거래처 수정
	public int deallerUpdate(Dealler dealler) {
		System.out.println("DeallerUpdate Service");
		return deallerMapper.deallerUpdate(dealler);
	}
	
	public Dealler getDeallerByCode(String deallerCode) {
		System.out.println("GetDeallerByCode Service");
		return deallerMapper.getDeallerByCode(deallerCode);
	}
}
