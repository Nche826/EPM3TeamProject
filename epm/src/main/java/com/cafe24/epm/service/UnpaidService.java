package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Unpaid;
import com.cafe24.epm.domain.UnpaidT;
import com.cafe24.epm.mapper.UnpaidMapper;

@Service
public class UnpaidService {
	
	
	@Autowired private UnpaidMapper unpaidMapper;
	
	//처리 리스트
	public List<Unpaid> unpaidList (){
		return unpaidMapper.unpaidList();
	}
	
	//처리업무선택
	public Unpaid unpaidSelect (String unpaidCode){
		return unpaidMapper.unpaidSelect(unpaidCode);
	}
	
	//처리업무등록
	public int unpaidInsert(Unpaid unpaid){
		return unpaidMapper.unpaidInsert(unpaid);
	}
	
	//처리업무 완료처리
	public int unpaidPro (String unpaidCode, String unpaidProMemberName, String unpaidProStoreName) {
		return unpaidMapper.unpaidPro(unpaidCode, unpaidProMemberName, unpaidProStoreName);
	}
	
	//처리업무수정
	public int unpaidUpdate (Unpaid unpaid) {
		return unpaidMapper.unpaidUpdate(unpaid);
	}
	
	//처리업무삭제
	public int unpaidDelete (String unpaidCode) {
		return unpaidMapper.unpaidDelete(unpaidCode);
	}

	public List<UnpaidT> unpaidTList() {
		return unpaidMapper.unpaidTList();
	}
}
