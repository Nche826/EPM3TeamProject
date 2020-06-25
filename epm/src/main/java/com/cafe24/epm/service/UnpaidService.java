package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Unpaid;
import com.cafe24.epm.mapper.UnpaidMapper;

@Service
public class UnpaidService {
	
	
	@Autowired private UnpaidMapper unpaidMapper;
	
	//처리 리스트
	public List<Unpaid> unpaidList (){
		List<Unpaid> unpaid = unpaidMapper.unpaidList();
		System.out.println(unpaid);
		return unpaid;
	}
	
	//처리업무선택
	public Unpaid unpaidSelect (String unpaidCode){
		Unpaid unpaid = unpaidMapper.unpaidSelect(unpaidCode);
		System.out.println("처리업무선택 : "+unpaid);
		return unpaid;
	}
	
	//처리업무등록
	public int unpaidInsert(Unpaid unpaid){
		System.out.println("처리업무등록 : "+unpaid);
		return unpaidMapper.unpaidInsert(unpaid);
	}
	
	//처리업무 완료처리
	public int unpaidPro (String unpaidCode, String unpaidProMemberName, String unpaidProStoreName) {
		System.out.println(unpaidCode+"/"+unpaidProMemberName+"/"+unpaidProStoreName);
		return unpaidMapper.unpaidPro(unpaidCode, unpaidProMemberName, unpaidProStoreName);
	}
	
	//처리업무수정
	public int unpaidUpdate (Unpaid unpaid) {
		return unpaidMapper.unpaidUpdate(unpaid);
	}
}
