package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OpenDeviceController {

	@GetMapping("/openList")
	public String openList() {
		return "open/openList";
		
	}
	@GetMapping("/openTList")
	public String openTList() {
		return "open/openTList";
		
	}
	
	@GetMapping("/openDeviceInsert")
	public String openDeviceInsert() {
		
		return "open/openDeviceInsert";
		
	}
	@GetMapping("/openDeviceUpdate")
	public String openDeviceUpdate() {
		
		return "open/openDeviceUpdate";
		
	}
	@GetMapping("/openUsimInsert")
	public String openUsimInsert() {
		
		return "open/openUsimInsert";
		
	}
	@GetMapping("/openUsimUpdate")
	public String openUsimUpdate() {
		
		return "open/openUsimUpdate";
		
	}
	

}
