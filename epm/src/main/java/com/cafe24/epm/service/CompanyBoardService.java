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
	//게시물 등록
	public int companyBoardInsert(CompanyBoardContent companyBoardContent) {
		return companyBoardMapper.companyBoardInsert(companyBoardContent);
	}
	//게시물 조회수
	public int companyBoardCountUpadate(String companyCode) {
		return companyBoardMapper.companyBoardCountUpadate(companyCode);
	}
	//게시물 수정
	public int companyBoardUpadate(CompanyBoardContent companyBoardContent) {
		return companyBoardMapper.companyBoardUpadate(companyBoardContent);
	}
	//게시물 삭제
	public int companyBoardDelete(String companyCode) {
		return companyBoardMapper.companyBoardDelete(companyCode);		
	}
	//댓글 목록
	public List<CompanyBoardComment> companyCommentList (String companyCode){
		return companyBoardMapper.companyCommentList(companyCode);
	}
	//댓글코드로 댓글 선택 
	public CompanyBoardComment companyCommentSelectByCCode (CompanyBoardComment companyBoardComment){
		return companyBoardMapper.companyCommentSelect(companyBoardComment);
	}
	//글 코드로 댓글 선택
	public List<CompanyBoardComment> companyCommentSelectByCode(String companyCode) {
		return companyBoardMapper.companyCommentSelectByCode(companyCode);
	}
	//댓글 등록
	public int companyCommentInsert(CompanyBoardComment companyBoardComment) {
		return companyBoardMapper.companyCommentInsert(companyBoardComment);
	}
	//댓글 수정
	public int companyCommentUpdate(CompanyBoardComment companyBoardComment) {
		return companyBoardMapper.companyCommentUpdate(companyBoardComment);
	}
	//댓글 삭제
	public int companyCommentDelete(String companyCCode) {
		return companyBoardMapper.companyCommentDelete(companyCCode);
	}
}
