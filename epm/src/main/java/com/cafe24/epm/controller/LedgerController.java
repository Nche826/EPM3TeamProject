package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //김수지담당
public class LedgerController { 
	
	
	
	//수납 장부 등록 화면
	@GetMapping("/ledgerInsert")
	public String ledgerInsert() {
		return "ledger/ledgerInsert";
	}

	//수납 장부 수정 화면
	@GetMapping("/ledgerUpdate")
	public String ledgerUpdate() {
		return "ledger/ledgerUpdate";
	}
	
	//수납 장부 리스트 화면
	@GetMapping("/ledgerList")
	public String ledgerList() {
		return "ledger/ledgerList";
	}

	//수납 장부 이력 화면
	@GetMapping("/ledgerTList")
	public String ledgerTList() {
		return "ledger/ledgerTList";
	}
}
