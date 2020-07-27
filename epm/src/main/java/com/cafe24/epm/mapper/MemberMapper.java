package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Login;
import com.cafe24.epm.domain.Member;

@Mapper
public interface MemberMapper {
	//회원가입
	public int memberInsert (Member member);
	
	//회원선택
	public Member memberSelect (String memberId);

	//회원수정
	public int memberUpdate (Member member);
	  
	//회원삭제
	public int memberDelete (Member member);
	  
	//회원리스트
	public List<Member> memberList ();
	
	//로그인기록
	public int memberlogin(String memberId);

	//로그아웃기록
	public int memberlogout(String memberId);

	//회원 검색
	public List<Member> memberSearch(String searchD1, String searchD2, String searchK, String searchV);
	 
}

