package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.domain.Store;
import com.cafe24.epm.service.StaffService;
import com.cafe24.epm.service.StoreService;

@Controller //김수지담당
public class StaffController { 
	
	@Autowired private StoreService storeService;
	@Autowired private StaffService staffService;
	
	
	//직원등록 화면 처리 
	@PostMapping("/staffInsert")
	public String staffInsert(Staff staff){
	System.out.println("========매장 등록 시작 ==========");
	System.out.println(staff.toString());
	int i = staffService.addStaff(staff);
	System.out.println("직원 등록 처리 성공시 1이 떠야되요-->"+i);
		return "redirect:/staffList";
	}
	
	
	
	//직원 수정 화면
	@GetMapping("/staffUpdate")
	public String staffUpdate() {
		return "setting/staffUpdate";
	}
	
	//직원 관리 리스트 화면
	@GetMapping("/staffList")
	public String staffList(Model model) {
		System.out.println("======모달에 들어갈 셀렉트 박스 매장 리스트 가져오기 시작 =====");
		List<Store> store_name = storeService.storeList();
		System.out.println("매장 리스트 --->"+store_name);
		System.out.println("===========================");
		model.addAttribute("store", store_name);
		return "setting/staffList";
	}
}
