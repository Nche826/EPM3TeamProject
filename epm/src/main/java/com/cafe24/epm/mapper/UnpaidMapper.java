package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Unpaid;

@Mapper
public interface UnpaidMapper {
	//처리 리스트
	public List<Unpaid> unpaidList ();
	//처리업무선택
	public Unpaid unpaidSelect();	
	//처리업무등록
	public Unpaid unpaidInsert();
}
