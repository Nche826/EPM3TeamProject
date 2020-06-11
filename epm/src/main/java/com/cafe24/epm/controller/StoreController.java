package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //김수지담당
public class StoreController {
	
	//매장 수정 화면 가져오기
	@GetMapping("/storeUpdate")
	public String storeUpdate() {
		return "setting/storeUpdate";
	}
	
	//매장 등록 화면 가져오기
	@GetMapping("/storeInsert")
	public String storeInsert() {
		return "setting/storeInsert";
	}
	
	//매장 관리 리스트 화면 가져오기
	@GetMapping("/storeList")
	public String storeList() {
		return "setting/storeList";
	}
}
