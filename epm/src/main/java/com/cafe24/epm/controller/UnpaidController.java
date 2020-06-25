package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@PostMapping(value = "/unpaidSelect", produces = "application/json")
	@ResponseBody
	public Unpaid unpaidSelect(String unpaidCode) {
	  return unpaidService.unpaidSelect(unpaidCode);
	  }
	
	@GetMapping("/unpaidTList")
	public String unpaidTList() {
		return "unpaid/unpaidTList";
	}
	
	@PostMapping("/unpaidPro")
	public String unpaidPro(String unpaidCode, String unpaidProMemberName, String unpaidProStoreName) {
		unpaidService.unpaidPro(unpaidCode, unpaidProMemberName, unpaidProStoreName);
		return "redirect:/unpaidList";
	}
	
	@PostMapping("/unpaidUpdate")
	public String unpaidUpdate(Unpaid unpaid) {
		unpaidService.unpaidUpdate(unpaid);
		return "redirect:/unpaidList";
	}
}
