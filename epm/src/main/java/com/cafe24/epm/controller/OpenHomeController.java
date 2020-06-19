package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OpenHomeController {

	@GetMapping("/openHomeList")
	public String openHomeList() {
		
		return "/open/openHomeList";
	}
	@GetMapping("/openHomeInsert")
	public String openHomeInsert() {
		
		return "/open/openHomeInsert";
	}
	@GetMapping("/openHomeUpdate")
	public String openHomeUpdate() {
		
		return "/open/openHomeUpdate";
	}
	
	@GetMapping("/openHomeInfo")
	public String openHomeInfo() {
		
		return "/open/openHomeInfo";
	}
	
	@GetMapping("/openHomeTList")
	public String openHomeTList() {
		
		return "/open/openHomeTList";
	}
}
