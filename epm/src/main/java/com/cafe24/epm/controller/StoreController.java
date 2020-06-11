package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {

	
	@GetMapping("/storeList")
	public String storeList() {
		
		return "/setting/storeList";
	}
	@GetMapping("/storeInsert")
	public String storeInsert() {
		
		return "/setting/storeInsert";
	}
	@GetMapping("/storeUpdate")
	public String storeUpdate() {
		
		return "/setting/storeUpdate";
	}

}
