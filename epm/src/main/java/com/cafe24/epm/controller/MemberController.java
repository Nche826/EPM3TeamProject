package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	@GetMapping("/login")
	public String login () {
		return ("login/login");
	}
	
	@GetMapping("/memberInsert")
	public String memberInsert() {
		return("member/memberInsert");
	}
	
	@GetMapping("/memberDelete")
	public String memberDelete() {
		return("member/memberDelete");
	}
	
	@GetMapping("/memberUpdate")
	public String memberUpdate() {
		return("member/memberUpdate");
	}
	
	@GetMapping("/memberList")
	public String memberList() {
		return("member/memberList");
	}
	
}
