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
		int insert = deviceService.deviceInsert(device);
		int info = deviceService.deviceInfoInsert(device);
		System.out.println("성공여부: "+insert);
		System.out.println("성공여부: "+info);
		return "redirect:/deviceList";
	}
	
	@PostMapping("/deviceUpdate")
	public String deviceUpdate(Device device) {
		System.out.println(device.toString());
		int update = deviceService.deviceUpdate(device);
		int infoupdate = deviceService.deviceInfoUpdate(device);
		System.out.println("성공여부: "+update);
		System.out.println("성공여부: "+infoupdate);
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

