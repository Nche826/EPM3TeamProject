package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsimController {
	@GetMapping("/usimInsert")
	public String usimInsert(Model model) {
		model.addAttribute("title", "유심 등록");
		return "usim/usimInsert";
	}
	
	@GetMapping("/usimList")
	public String usimList(Model model) {
		model.addAttribute("title", "유심 리스트");
		return "usim/usimList";
	}
}
