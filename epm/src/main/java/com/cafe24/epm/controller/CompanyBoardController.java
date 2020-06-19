package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyBoardController {
	
	//게시물 리스트
	@GetMapping("/companyListContents")
	public String companyListContents () {
		return"company/companyListContents";
	}
	
	//게시물 상세 화면
	@GetMapping("/companyContents")
	public String companyContents () {
		return"company/companyContents";
	}

	//게시물 등록 화면
	@GetMapping("/companyInsertContents")
	public String companyInsertContents () {
		return"company/companyInsertContents";
	}
	
	//게시물 수정 화면
	@GetMapping("/companyUpdateContents")
	public String companyUpdateContents () {
		return"company/companyUpdateContents";
	}
	
	//댓글 목록
	@GetMapping("/companyComment")
	public String companyComment () {
		return"company/companyComment";
	}
}
