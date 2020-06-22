package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.epm.domain.Dealler;
import com.cafe24.epm.service.DeallerService;

@Controller
public class DeallerController {
	
	@Autowired private DeallerService deallerService;
	
	//거래처 리스트
	@GetMapping("/deallerList")
	public String deallerList(Model model, Dealler dealler) {
		List<Dealler> deallerList = deallerService.deallerList();
		System.out.println("deallerList : " + deallerList);
		model.addAttribute("title", "거래처 관리");
		model.addAttribute("deallerList", deallerList);
		return "/setting/deallerList";
	}
	
	//거래처 수정
	@GetMapping("/deallerUpdate")
	public String deallerUpdate(@RequestParam(value="deallerCode") String deallerCode, Model model) {
		model.addAttribute("dealler", deallerService.getDeallerByCode(deallerCode));
		return "/setting/deallerUpdate";
	}
	
	@PostMapping("/deallerUpdate")
	public String deallerUpdate(Dealler dealler) {
		System.out.println("================");
		System.out.println(dealler.toString());
		deallerService.deallerUpdate(dealler);
		return "redirect:/deallerList";
	}
	
	//거래처 등록
	@GetMapping("/deallerInsert")
	public String deallerInsert() {
		return "/setting/deallerInsert";
	}
	
	//거래처 등록
	@PostMapping("/deallerInsert")
	public String deallerInsert(Dealler dealler) {
		System.out.println("================");
		System.out.println(dealler.toString());
		int i = deallerService.deallerInsert(dealler);
		System.out.println(i);
		return "redirect:/deallerList";
	}
}
