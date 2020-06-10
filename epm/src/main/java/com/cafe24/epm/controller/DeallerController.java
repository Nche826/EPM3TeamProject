package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeallerController {
	//거래처 관리 리스트
	@GetMapping("/dealerList")
	public String dealerList(Model model) {
		model.addAttribute("title", "거래처 관리");
		return "/setting/dealerList";
	}
}
