package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {

	@GetMapping("/storeInsert")
	public String login() {
		
		return "/setting/storeList";
	}
}
