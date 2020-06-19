package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Member memberUpdateConfirm (Member member) {
		return null;
	}
	
	//회원리스트
	public List<Member> memberList () {
		return memberMapper.memberList();
	}
	
}
