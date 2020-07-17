package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.epm.domain.Dealler;
import com.cafe24.epm.domain.Ledger;
import com.cafe24.epm.domain.LedgerT;
import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.domain.Store;
import com.cafe24.epm.service.DeallerService;
import com.cafe24.epm.service.LedgerService;
import com.cafe24.epm.service.StaffService;
import com.cafe24.epm.service.StoreService;

@Controller //김수지담당
public class LedgerController { 
	
	@Autowired private StoreService storeService;
	@Autowired private StaffService staffService;
	@Autowired private DeallerService deallerService;
	@Autowired private LedgerService ledgerService;
	
	
	//수납 완료 처리
	@PostMapping("/ledgerEnd")
	@ResponseBody
	public int ledgerEnd(Model model, @RequestParam(value ="ledgerNames[]",required = false)String[] ledgerNames) {
		System.out.println("ledgerNames--->"+ledgerNames);
		System.out.println("==========수납상태 완료 처리 시작===========");
		int re =0;
		for(String receive_code : ledgerNames){
			System.out.println("송금 완료 처리할 코드 :"+ receive_code);
			re=ledgerService.ledgerEnd(receive_code);
			System.out.println("완료 여부 ===>"+re);
		}
		return re;
	}
	
	//수납 장부 삭제 처리
	@PostMapping("/ledgerDelete")
	@ResponseBody
	public int ledgerDelete(Model model, @RequestParam(value ="ledgerNames[]",required = false)String[] ledgerNames) {
		System.out.println("ledgerNames--->"+ledgerNames);
		System.out.println("==========수납 장부 삭제 시작===========");
		int re =0;
		for(String receive_code : ledgerNames){
			System.out.println("수납 내역 삭제 :"+ receive_code);
			re=ledgerService.ledgerDelete(receive_code);
			System.out.println("삭제 여부 ===>"+re);
		};
		
		return re;
	}
	
	
	//수납 장부 수정 처리
	@PostMapping("/ledgerUpdate")
	public String ledgerUpdate(Ledger ledger) {
		System.out.println("========수납 장부 수정 시작========");
		System.out.println("업데이트 할 내용 ledger -->"+ ledger.toString());
		ledgerService.ledgerUpdate(ledger);
		return "redirect:/ledgerList";
	}
	
	//수납 장부 수정 화면 : 코드값 가져오기
	@GetMapping("/ledgerUpdate")
	public String ledgerUpdate(Model model,@RequestParam(name="receive_code",required = false) String receive_code) {
		System.out.println("receive_code --->"+receive_code);
		System.out.println("========수납장부 수정 페이지 시작======");
		Ledger ledgerSelect = ledgerService.getLedgerSelect(receive_code);
		System.out.println("ledgerSelect-->"+ledgerSelect);
		model.addAttribute("ledgerSelect", ledgerSelect);
		System.out.println("===============================");
		return "ledger/ledgerUpdate";
	}
	
	
	
	//수납 장부 등록 처리
	@PostMapping("/ledgerInsert")
	public String ledgerInsert(Ledger ledger) {
		System.out.println("======수납 장부 등록 시작 ==========");
		System.out.println(ledger.toString());
		int i = ledgerService.addLedger(ledger);
		System.out.println("직원 등록 처리 성공시 1 --->"+i);
		return "redirect:/ledgerList";
	}
	
	
	//수납 장부 등록 화면
	@GetMapping("/ledgerInsert")
	public String ledgerInsert() {
		return "ledger/ledgerInsert";
	}

	//수납장부 리스트 화면 
	@PostMapping("/ledgerList")
	@ResponseBody
	public List<Staff> ledgerList(String store_code) {
		System.out.println("====매장 클릭시 직원 셀렉트 처리=====");
		List<Staff> staff_name = staffService.storeInStaff(store_code);
		System.out.println("직원 목록--->"+staff_name);
		return staff_name;
	}
	
	//수납 장부 리스트 화면
	@GetMapping("/ledgerList")
	public String ledgerList(Model model, Ledger ledger) {
		System.out.println("=========모달 내 매장 정보 불러오기==========");
		List<Store> store_name = storeService.storeList();
		System.out.println("매장 리스트 --->"+store_name);
		model.addAttribute("store", store_name);
		System.out.println("===========================");
		System.out.println("=========모달 내 거래처 정보 불러오기=========");
		List<Dealler> dealler_name = deallerService.deallerList();
		System.out.println("거래처 리스트 --->"+dealler_name);
		model.addAttribute("dealler", dealler_name);
		System.out.println("========수납 장부 리스트 시이~~작!!=========");
		List<Ledger> ledgerList = ledgerService.ledgerList();
		System.out.println("수납 장부 리스트---->"+ledgerList);
		model.addAttribute("ledgerList", ledgerList);
		return "ledger/ledgerList";
	}

	//수납 장부 이력 화면
	@GetMapping("/ledgerTList")
	public String ledgerTList(Model model, LedgerT ledgerT ) {
		System.out.println("장부 이력 조회 시작");
		List<LedgerT> ledgerList = ledgerService.ledgerTList();
		model.addAttribute("ledgerList", ledgerList);
		return "ledger/ledgerTList";
	}
}
