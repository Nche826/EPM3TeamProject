package com.cafe24.epm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe24.epm.domain.Member;
import com.cafe24.epm.service.MemberService;

@Controller
public class MainController {
	
	@Autowired private MemberService memberService;
	
	@GetMapping("/")
	public String main ( ) {
		return "main";
	}
		
	@GetMapping("/index")
	public String index () {
		return "index";
	}

	//로그인처리
	@PostMapping("/login")
	public String login (Member member , HttpSession session, RedirectAttributes redirectAttr) {
		//1단계 : member 객체  memberId, memberPw 확인
				System.out.println(member);
				if(!"".equals(member.getMemberId()) && !"".equals(member.getMemberPw())
					&& member.getMemberId() !=null && member.getMemberPw() !=null	){
					//2단계 : 받았던 memberPw, 조회된 memberPw 비교
					Member result = memberService.memberSelect(member.getMemberId());
					if(result != null && member.getMemberPw().equals(result.getMemberPw())) {
							//2-1단계 : 일치하면 세션 등록
							session.setAttribute("S_ID", result.getMemberId());
							session.setAttribute("S_NAME", result.getMemberName());

							System.out.println("============로그인성공============");
							System.out.println(session.getAttribute("S_ID")+"<< S_ID");
							System.out.println(session.getAttribute("S_NAME")+"<< S_NAME");
							System.out.println(session.getAttribute("S_LEVEL")+"<< S_LEVEL");
							return "redirect:/";
						}
					}
		System.out.println("============로그인실패============");
		redirectAttr.addAttribute("message","등록된 정보가 없습니다.");
		return "redirect:/index";
	}
	
	//로그아웃처리
	@GetMapping("/logout")
	public String logout (HttpSession session) {
		session.invalidate();
		System.out.println("============로그아웃============");
		return"redirect:/login";
	}
	
	@GetMapping("/login")
	public String login () {
		return "login/login";
	}
}
