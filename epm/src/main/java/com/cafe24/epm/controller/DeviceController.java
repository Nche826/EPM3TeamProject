package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeviceController {	
	
	@GetMapping("/deviceInsert")
	public String login() {
		
		return "/device/deviceList";
	}
}

