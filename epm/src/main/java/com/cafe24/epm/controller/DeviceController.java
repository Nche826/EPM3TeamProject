package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.epm.domain.Device;
import com.cafe24.epm.service.DeviceService;


@Controller
public class DeviceController {	
	@Autowired private DeviceService deviceService;
	
	@GetMapping("/deviceList")
	public String deviceList(Model model) {
		
		List<Device> deviceList = deviceService.deviceList();
		model.addAttribute("deviceList", deviceList);
		return "device/deviceList";
	}
	@PostMapping("/deviceInsert")
	public String deviceInsert(Device device) {
		System.out.println(device.toString());
		int i = deviceService.deviceInsert(device);
		System.out.println("성공여부: "+i);
		return "redirect:/deviceList";
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

