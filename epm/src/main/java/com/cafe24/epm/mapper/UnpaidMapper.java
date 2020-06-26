package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Unpaid;

@Mapper
public interface UnpaidMapper {
	//처리 리스트
	public List<Unpaid> unpaidList();
		
	//처리업무선택
	public Unpaid unpaidSelect(String unpaidCode);	
	
	//처리업무등록
	public int unpaidInsert(Unpaid unpaid);
	
	//처리업무완료처리
	public int unpaidPro(String unpaidCode, String unpaidProMemberName, String unpaidProStoreName);	 

	//처리업무수정
	public int unpaidUpdate (Unpaid unpaid);
	
	//처리업무삭제
	public int unpaidDelete (String unpaidCode);

}
