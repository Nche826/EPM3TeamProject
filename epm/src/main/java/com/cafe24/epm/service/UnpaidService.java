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
		return unpaidMapper.unpaidList();
	}
}