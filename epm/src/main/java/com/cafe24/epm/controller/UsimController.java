package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsimController {

	//유심 관리 화면
	@GetMapping("/usimList")
	public String usimList(Model model) {
		model.addAttribute("title", "유심 리스트");
		return "usim/usimList";
	}
}
