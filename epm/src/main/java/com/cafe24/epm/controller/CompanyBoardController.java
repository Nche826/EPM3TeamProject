package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyBoardController {
	@GetMapping("/companyListContents")
	public String board () {
		return"company/companyListContents";
	}
}
