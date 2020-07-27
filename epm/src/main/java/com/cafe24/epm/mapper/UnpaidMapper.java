package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Unpaid;
import com.cafe24.epm.domain.UnpaidT;

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
	
	//처리업무 이력 리스트
	public List<UnpaidT> unpaidTList();
	
	//처리업무 이력 삭제
	public int unpaidTDelete(String unpaidtCode);

	//처리업무 검색
	public List<Unpaid> unpaidSearch(String searchD1, String searchD2, String statusSearch, String subjectSearch, String staffSearch, String searchK, String searchV);

	//처리업무 이력 검색
	public List<Unpaid> unpaidTSearch(String searchD1, String searchD2, String statusSearch, String subjectSearch,
			String staffSearch, String searchK, String searchV);

}
