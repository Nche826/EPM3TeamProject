package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Dealler;

@Mapper
public interface DeallerMapper {
	
	//거래처 등록
	public int deallerInsert(Dealler dealler);
	
	//거래처 리스트
	public List<Dealler> deallerList();
	
	//거래처 수정
	public int deallerUpdate(Dealler dealler);
	
	public Dealler getDeallerByCode(String deallerCode);
}
