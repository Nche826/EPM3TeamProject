package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnpaidController {
	@GetMapping("/unpaidInsert")
	public String unpaidInsert() {
		return "unpaid/unpaidInsert";
	}
	@GetMapping("/unpaidList")
	public String unpaidList() {
		return "unpaid/unpaidList";
	}
	@GetMapping("/unpaidTList")
	public String unpaidTList() {
		return "unpaid/unpaidTList";
	}
	@GetMapping("/unpaidUpdate")
	public String unpaidUpdate() {
		return "unpaid/unpaidUpdate";
	}
}
