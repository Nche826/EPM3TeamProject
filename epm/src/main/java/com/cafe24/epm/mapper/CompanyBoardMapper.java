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
	//게시물 등록
	public int companyBoardInsert(CompanyBoardContent companyBoardContent);
	//게시물 조회수 업데이트
	public int companyBoardCountUpadate(String companyCode);
	//게시물 수정
	public int companyBoardUpadate(CompanyBoardContent companyBoardContent);
	//게시물 삭제
	public int companyBoardDelete(String companyCode);
	//댓글 목록
	public List<CompanyBoardComment> companyCommentList(String companyCode);
	//댓글코드로 댓글 선택
	public CompanyBoardComment companyCommentSelect(CompanyBoardComment companyBoardComment);
	//글코드로 댓글 선택
	public List<CompanyBoardComment> companyCommentSelectByCode(String companyCode);
	//댓글 등록
	public int companyCommentInsert(CompanyBoardComment companyBoardComment);
	//댓글 수정
	public int companyCommentUpdate(CompanyBoardComment companyBoardComment);
	//댓글 삭제
	public int companyCommentDelete(String companyCCode);
	//게시판 검색
	public List<CompanyBoardContent> companyBoardSearch(String searchD1, String searchD2, String searchK, String searchV);


}
