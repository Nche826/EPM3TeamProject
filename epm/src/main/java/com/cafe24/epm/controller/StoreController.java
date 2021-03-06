package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.epm.domain.Store;
import com.cafe24.epm.service.StoreService;

@Controller //김수지담당
public class StoreController {
	
	@Autowired private StoreService storeService;
	
	
	//매장 삭제 
	@PostMapping("/storeDelete")
	@ResponseBody
	public int storeDelete(Model model, @RequestParam(value="storeNames[]",required = false) String[] storeNames) {
		System.out.println("storeNames ---->"+storeNames);
		System.out.println("==========매장 삭제 시작 ===========");
		int re =0;
		  for(String store_Name : storeNames) { //향상된 for문 처리 
		  System.out.println("사용자 삭제  :"+store_Name); //int delete_count 
		 re = storeService.storeDelete(store_Name); 
		 System.out.println("re ==> "+re);}
		 
		return re;
	}
	
	//매장 수정 처리 
	@PostMapping("/storeUpdate")
	public String storeUpdate(Store store) {
		System.out.println("==========내용 수정 시작 =========");
		System.out.println("업데이트 할 내용 store"+store.toString());
		storeService.storeUpdate(store);
		return "redirect:/storeList";
	}
	
	//매장 수정 화면 가져오기
	@GetMapping("/storeUpdate")
	public String storeUpdate(Model model,@RequestParam(name="store_Name",required = false) String store_Name) {
		System.out.println("store_Name--->"+store_Name);
		System.out.println("=======수정페이지 시작============");
		Store storeSelect = storeService.getStoreSelect(store_Name);
		System.out.println("작업 결과 ----->"+storeSelect);
		model.addAttribute("storeSelect", storeSelect);
		System.out.println("============================");
		List<Store> staffSelect =storeService.getstaffSelect(store_Name);
		System.out.println("작업 결과 ----->"+staffSelect);
		model.addAttribute("staffSelect", staffSelect);
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
	
	
	
	//매장리스트 화면 가져오기
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
