package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeviceController {	
	
	@GetMapping("/deviceList")
	public String deviceList() {
		
		return "/device/deviceList";
	}
	@GetMapping("/deviceInsert")
	public String deviceInsert() {
		
		return "/device/deviceInsert";
	}
	@GetMapping("/deviceUpdate")
	public String deviceUpdate() {
		
		return "/device/deviceUpdate";
	}
	@GetMapping("/deviceInfo")
	public String deviceInfo() {
		
		return "/device/deviceInfo";
	}
}

