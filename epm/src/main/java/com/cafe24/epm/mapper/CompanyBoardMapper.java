package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.CompanyBoardComment;
import com.cafe24.epm.domain.CompanyBoardContent;

@Mapper
public interface CompanyBoardMapper {
	//게시판 목록
	public List<CompanyBoardContent> companyBoardList();
	//게시판 선택
	public CompanyBoardContent companyBoardSelect(String companyCode);
	//댓글 목록
	public List<CompanyBoardComment> companyCommentList(String companyCode);
	//게시물 등록
	public int companyBoardInsert(CompanyBoardContent companyBoardContent);
	//게시물 조회수 업데이트
	public int companyBoardCountUpadate(String companyCode);
}
