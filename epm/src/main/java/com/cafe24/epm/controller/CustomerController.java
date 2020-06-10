package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	//고객수정화면 가져오기
	@GetMapping("/customerUpdate")
	public String customerUpdate() {
		return "customer/customerUpdate";
	}
	
	//고객리스트 화면 가져오기
	@GetMapping("/customerList")
	public String customerList() {
		return "customer/customerList";
	}
}
