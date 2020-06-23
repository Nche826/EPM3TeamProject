package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.epm.domain.Unpaid;
import com.cafe24.epm.service.UnpaidService;

@Controller
public class UnpaidController {
	@Autowired UnpaidService unpaidService;
	
	@GetMapping("/unpaidInsert")
	public String unpaidInsert() {
		return "unpaid/unpaidInsert";
	}
	
	
	@PostMapping("/unpaidInsert") 
	public String unpaidInsert(Unpaid unpaid) {
		unpaidService.unpaidInsert(unpaid);
	  return "redirect:/unpaidList";
	  }
	 
	
	@GetMapping("/unpaidList")
	public String unpaidList(Model model) {
		System.out.println("=====UnpaidController unpaidList=====");
		List<Unpaid> unpaidList = unpaidService.unpaidList();
		System.out.println("unpaidList : "+unpaidList);
		model.addAttribute("unpaidList",unpaidList);
		return "unpaid/unpaidList";
	}
	
	@GetMapping("/unpaidTList")
	public String unpaidTList() {
		return "unpaid/unpaidTList";
	}
	
	@GetMapping("/unpaidUpdate")
	public String unpaidUpdate() {
		return "unpaid/unpaidUpdate";
	}
}
