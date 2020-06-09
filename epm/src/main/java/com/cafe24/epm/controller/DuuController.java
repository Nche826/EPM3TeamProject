package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DuuController {
	//보유 현황 리스트
	@GetMapping("/duuHoldList")
	public String duuHoldList(Model model) {
		model.addAttribute("title", "보유 현황");
		return "/duu/duuHoldList";
	}
	
	//판매 관리 리스트
	@GetMapping("/duuSellList")
	public String duuSellList(Model model) {
		model.addAttribute("title", "판매 관리");
		return "/duu/duuSellList";
	}
	
	//재고 이력 리스트
		@GetMapping("/duuInvenList")
		public String duuInvenList(Model model) {
			model.addAttribute("title", "재고 이력");
			return "/duu/duuInvenList";
	}
}
