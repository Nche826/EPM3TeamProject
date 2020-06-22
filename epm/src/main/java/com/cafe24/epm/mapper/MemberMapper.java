package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

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
	 
}

