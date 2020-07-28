package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.epm.domain.Used;
import com.cafe24.epm.service.UsedService;

@Controller
public class UsedController {	
	@Autowired private UsedService usedService;
	
	@GetMapping("/usedList")
	public String usedList(Model model) {
		List<Used> usedList = usedService.usedList();
		model.addAttribute("usedList", usedList);		
		return "used/usedList";
	}
	
	@PostMapping("/usedsearchList")
	public String searchList(Model model, Used used) {
		System.out.println(used.toString());
		List<Used> usedsearchList = usedService.usedsearchList(used);
		System.out.println(usedsearchList.toString()+"<------result");
		
		model.addAttribute("usedList", usedsearchList);
		return "used/usedList";
	}
	
	@PostMapping("/usedInsert")
	public String usedInsert(Used used) {
		System.out.println(used.toString());
		int insert = usedService.usedInsert(used);
		System.out.println("성공여부: "+insert);
		return "redirect:/usedList";
	}
	
	@PostMapping("/usedUpdate")
	public String usedUpdate(Used used) {
		System.out.println(used.toString());
		int update = usedService.usedUpdate(used);
		System.out.println("성공여부: "+update);
		return "redirect:/usedList";
	}
	
	@PostMapping("/usedDelete")
	public String usedDelete(Used used) {
		System.out.println(used.toString());
		int delete = usedService.usedDelete(used);		
		System.out.println("성공여부: "+delete);
		return "redirect:/usedList";
	}
	
	@GetMapping("/usedUpdate")
	public String usedUpdate() {
		
		return "/used/usedUpdate";
	}
	@GetMapping("/usedInfo")
	public String usedInfo() {
		
		return "/used/usedInfo";
	}
}
