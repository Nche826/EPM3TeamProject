package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsedController {	
	
	@GetMapping("/usedList")
	public String usedList() {
		
		return "/used/usedList";
	}
	@GetMapping("/usedInsert")
	public String usedInsert() {
		
		return "/used/usedInsert";
	}
	@GetMapping("/usedUpdate")
	public String usedUpdate() {
		
		return "/used/usedUpdate";
	}
}
