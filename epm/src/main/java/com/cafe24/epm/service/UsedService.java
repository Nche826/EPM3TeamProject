package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Used;
import com.cafe24.epm.mapper.UsedMapper;

@Service
public class UsedService {
	@Autowired private UsedMapper usedMapper;
	
	public Used usedSelect(String deviceCode) {
		return usedMapper.usedSelect(deviceCode);
	}
	
	public List<Used> usedList(){
		return usedMapper.usedList();
	}
	
	public List<Used> usedsearchList(Used used){
		return usedMapper.usedsearchList(used);
	}

	public int usedInsert(Used used) {
		return usedMapper.usedInsert(used);
	}
	
	public int usedInfoInsert(Used used) {
		return usedMapper.usedInfoInsert(used);
	}
	
	public int usedInfoUpdate(Used used) {
		return usedMapper.usedInfoUpdate(used);
	}
	
	public int usedUpdate(Used used) {
		return usedMapper.usedUpdate(used);
	}
	
	public int usedDelete(Used used) {
		return usedMapper.usedDelete(used);
	}
	
	public int usedInfoDelete(Used used) {
		return usedMapper.usedInfoDelete(used);
	}
	
}
