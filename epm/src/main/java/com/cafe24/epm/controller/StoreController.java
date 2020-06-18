package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.epm.domain.Store;
import com.cafe24.epm.service.StoreService;

@Controller //김수지담당
public class StoreController {
	
	@Autowired private StoreService storeService;
	
	//매장 수정 화면 가져오기
	@GetMapping("/storeUpdate")
	public String storeUpdate() {
		
		return "setting/storeUpdate";
	}
	
	//매장 등록 하기
	@PostMapping("/addstore")
	public String addStore(Store store) {
		System.out.println("=======매장 등록 시작 =======");
		System.out.println(store.toString());
		int i = storeService.addStore(store);
		System.out.println("매장 실행 결과되면 1이 떠요-->"+i);
		return "redirect:/storeList";
	}
	
	
	
	//매장 관리 리스트 화면 가져오기
	@GetMapping("/storeList")
	public String storeList(Model model , Store store) {
		System.out.println("=====매장 리스트 컨트롤러 시작 ======");
		List<Store> storeList = storeService.storeList();
		System.out.println("매장 리스트 --->"+storeList);
		System.out.println("===========================");
		model.addAttribute("storeList", storeList);
		return "setting/storeList";
	}
}
