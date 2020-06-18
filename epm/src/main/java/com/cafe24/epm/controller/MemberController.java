package com.cafe24.epm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.epm.domain.Member;
import com.cafe24.epm.mapper.MemberMapper;
import com.cafe24.epm.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired private MemberService memberService;
	@Autowired private MemberMapper memberMapper;

	/* 로그인 로그아웃을 staffcontroller에서 처리해야함
	 * @GetMapping("/logout") public String logout (HttpSession session) {
	 * session.invalidate(); System.out.println("=====로그아웃=====");
	 * return"redirect:/login"; }
	 * 
	 * @PostMapping("/login") public String login (Staff staff, HttpSession session,
	 * RedirectAttributes redirectAttr) { System.out.println("staff : "+staff);
	 * if(!"".equals(staff.getMemberId()) && !"".equals(staff.getMemberPw())){
	 * Member result = memberService.memberSelect(staff.getMemberId()); if(result !=
	 * null && staff.getMemberPw().equals(result.getMemberPw())) {
	 * 
	 * } } return ("login/login"); }
	 * 
	 * @GetMapping("/login") public String login () { return ("login/login"); }
	 */
	
	@GetMapping("/memberInsert")
	public String memberInsertView() {
		return"member/memberInsert";
	}
	
	@PostMapping("/memberInsert")
	public String memberInsert(Member member,  HttpServletRequest request) {
		
		memberService.memberInsert(member);
		return"member/memberList";
	}
	
	@GetMapping("/memberDelete")
	public String memberDelete() {
		return"member/memberDelete";
	}
	
	@PostMapping("/memberUpdate")
	public String memberUpdate(Member member) {
		
		return"member/memberUpdate";
	}
	
	@GetMapping("/memberUpdate")
	public String memberUpdate() {
		return"member/memberUpdate";
	}
	
	//개인 수정 화면 비밀번호 확인 후 수정화면으로 이동
	@PostMapping("/memberUpdateConfirm")
	public String memberUpdateConfirm(Member member,  HttpSession session, RedirectAttributes redirectAttr) {
		//1단계 : 로그인한 아이디와  memberId가 일치하는지 조회
		Member result = memberMapper.memberSelect((String)session.getAttribute("S_ID"));
		//2단계 : 조회된 정보의 pw와 입력된 pw 일치 여부
		if(!"".equals(member.getMemberPw())){
			if(result.getMemberPw().equals(member.getMemberPw())) {
				//pw 일치 시 진짜 수정화면으로 이동 
				return "member/memberUpdate"; 
			}
		}
		//pw 일치하지 않을 경우 비밀번호 확인 화면으로 이동하고 메세지 띄움 
		System.out.println("=====수정화면이동실패 : 비밀번호 오류=====");
		redirectAttr.addAttribute("message","비밀번호가 일치하지 않습니다.");
		return"redirect:/memberUpdateConfirm";
	}
	
	@GetMapping("/memberUpdateConfirm")
	public String memberUpdateConfirmView(HttpSession session, RedirectAttributes redirectAttr) {
		//세션에 등록된 권한이 관리자, 대표일 경우 비밀번호 확인 없이 수정화면으로 이동.
		if("관리자".equals((String)session.getAttribute("S_LEVEL")) || "대표".equals((String)session.getAttribute("S_LEVEL"))) {
			return "member/memberUpdate"; 
		}
		//세션에 등록된 권한이 관리자, 대표가 아닐 경우 리스트로 돌아가 메세지 출력 
		System.out.println("=====수정화면이동실패 : 권한 없음=====");
		redirectAttr.addAttribute("message","권한이 없습니다.");
		return"redirect:/memberList";
	}
		
	@GetMapping("/memberList")
	public String memberList(Model model) {
		System.out.println("=====MemberController memberList=====");
		List<Member> memberList = memberService.memberList();
		System.out.println("memberList : "+memberList);
		model.addAttribute("memberList",memberList);
		return"member/memberList";
	}
	
}
