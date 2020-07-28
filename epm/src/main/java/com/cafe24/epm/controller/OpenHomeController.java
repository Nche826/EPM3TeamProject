package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.epm.domain.OpenHome;
import com.cafe24.epm.service.OpenHomeService;

@Controller
public class OpenHomeController {
	@Autowired private OpenHomeService openHomeService;
	
	@GetMapping("/openHomeList")
	public String openHomeList(Model model) {
		
		List<OpenHome> openHomeList = openHomeService.openHomeList();
		model.addAttribute("openHomeList", openHomeList);		
		return "open/openHomeList";
	}
	
	@PostMapping("/openHomesearchList")
	public String openHomesearchList(Model model, OpenHome openHome) {
		System.out.println(openHome.toString());
		List<OpenHome> openHomesearchList = openHomeService.openHomesearchList(openHome);
		System.out.println(openHomesearchList.toString()+"<------result");
		
		model.addAttribute("openHomeList", openHomesearchList);
		return "open/openHomeList";
	}
	
	@PostMapping("/openHomeInsert")
	public String openHomeInsert(OpenHome openHome) {
		System.out.println(openHome.toString());
		int insert = openHomeService.openHomeInsert(openHome);
		System.out.println("성공여부: "+insert);
		return "redirect:/openHomeList";
	}
	
	@PostMapping("/openHomeUpdate")
	public String openHomeUpdate(OpenHome openHome) {
		System.out.println(openHome.toString());
		int update = openHomeService.openHomeUpdate(openHome);
		System.out.println("성공여부: "+update);
		return "redirect:/openHomeList";
	}
	
	@PostMapping("/openHomeDelete")
	public String openHomeDelete(OpenHome openHome) {
		System.out.println(openHome.toString());
		int delete = openHomeService.openHomeDelete(openHome);		
		System.out.println("성공여부: "+delete);
		return "redirect:/openHomeList";
	}
	
	@GetMapping("/openHomeUpdate")
	public String openHomeUpdate() {
		
		return "/open/openHomeUpdate";
	}
	
	@GetMapping("/openHomeInfo")
	public String openHomeInfo() {
		
		return "/open/openHomeInfo";
	}
	
	@GetMapping("/openHomeInsert")
	public String openHomeInsert() {
		
		return "/open/openHomeInsert";
	}
	
	@GetMapping("/openHomeTList")
	public String openHomeTList(Model model) {
		
		List<OpenHome> openHomeTList = openHomeService.openHomeTList();
		model.addAttribute("openHomeTList", openHomeTList);		
		return "open/openHomeTList";
	}
}
