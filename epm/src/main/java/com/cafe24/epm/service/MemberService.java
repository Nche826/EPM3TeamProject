package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Login;
import com.cafe24.epm.domain.Member;
import com.cafe24.epm.mapper.MemberMapper;

@Service
public class MemberService {
	
	@Autowired private MemberMapper memberMapper;
	
	//회원가입
	public int memberInsert (Member member) {
		return memberMapper.memberInsert(member);
	}
	
	//회원선택
	public Member memberSelect (String memberId) {
		return memberMapper.memberSelect(memberId);
	}
	
	//회원수정
	public int memberUpdate (Member member) {
		return memberMapper.memberUpdate(member);
	}
	
	//회원삭제
	public int memberDelete (Member member) {
		return memberMapper.memberDelete(member);
	}
	
	//회원리스트
	public List<Member> memberList () {
		return memberMapper.memberList();
	}
	
	//로그인기록
	public int memberlogin(String memberId) {
		return memberMapper.memberlogin(memberId);
	}
	
	//로그인기록
	public int memberlogout(String memberId) {
		return memberMapper.memberlogout(memberId);
	}

	//회원 검색
	public List<Member> memberSearch(String searchD1, String searchD2, String searchK, String searchV) {
		return memberMapper.memberSearch(searchD1,searchD2,searchK,searchV);
	}

}
