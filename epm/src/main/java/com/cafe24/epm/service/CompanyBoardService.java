package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.CompanyBoardComment;
import com.cafe24.epm.domain.CompanyBoardContent;
import com.cafe24.epm.mapper.CompanyBoardMapper;

@Service
public class CompanyBoardService {
	
	@Autowired private CompanyBoardMapper companyBoardMapper;
	
	//게시판 목록
	public List<CompanyBoardContent> companyBoardList() {
		return companyBoardMapper.companyBoardList();
	}
	//게시판 선택
	public CompanyBoardContent companyBoardSelect(String companyCode) {
		return companyBoardMapper.companyBoardSelect(companyCode);
	}
	//댓글 목록
	public List<CompanyBoardComment> companyCommentList (String companyCode){
		return companyBoardMapper.companyCommentList(companyCode);
	}
}
