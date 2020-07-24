package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.OpenHome;
import com.cafe24.epm.mapper.OpenHomeMapper;

@Service
public class OpenHomeService {
	@Autowired private OpenHomeMapper openHomeMapper;
	
	public OpenHome openHomeSelect(String openHomeCode) {
		return openHomeMapper.openHomeSelect(openHomeCode);
	}
	
	public List<OpenHome> openHomeList(){
		return openHomeMapper.openHomeList();
	}

	public List<OpenHome> openHomeTList(){
		return openHomeMapper.openHomeList();
	}
	
	public List<OpenHome> openHomesearchList(OpenHome openHome){
		return openHomeMapper.openHomesearchList(openHome);
	}

	public int openHomeInsert(OpenHome openHome) {
		return openHomeMapper.openHomeInsert(openHome);
	}
	
	public int openHomeInfoInsert(OpenHome openHome) {
		return openHomeMapper.openHomeInfoInsert(openHome);
	}
	
	public int openHomeInfoUpdate(OpenHome openHome) {
		return openHomeMapper.openHomeInfoUpdate(openHome);
	}
	
	public int openHomeUpdate(OpenHome openHome) {
		return openHomeMapper.openHomeUpdate(openHome);
	}
	
	public int openHomeDelete(OpenHome openHome) {
		return openHomeMapper.openHomeDelete(openHome);
	}
	
	public int openHomeInfoDelete(OpenHome openHome) {
		return openHomeMapper.openHomeInfoDelete(openHome);
	}
	
}
