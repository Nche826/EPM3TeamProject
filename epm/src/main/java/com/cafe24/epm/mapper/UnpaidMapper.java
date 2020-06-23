package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Unpaid;

@Mapper
public interface UnpaidMapper {
	//처리 리스트 완료 조건
	public List<Unpaid> unpaidList();
	
	//처리 리스트 (미처리)
	public List<Unpaid> unpaidListReg ();
	
	//처리 리스트 (처리완료)
	public List<Unpaid> unpaidListPro ();
	
	//처리업무선택
	public Unpaid unpaidSelect();	
	
	//처리업무등록
	public int unpaidInsert(Unpaid unpaid);
	 
}
