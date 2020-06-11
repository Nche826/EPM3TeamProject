package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmsController {
	//sms 발송 화면
	@GetMapping("/smsSend")
	public String smsSend(Model model) {
		model.addAttribute("title", "sms 발송");
		return "/sms/smsSend";
	}
	
	//sms 전송 이력 리스트
	@GetMapping("/smsList")
	public String smsList(Model model) {
		model.addAttribute("title", "sms 목록");
		return "/sms/smsList";
	}
}
