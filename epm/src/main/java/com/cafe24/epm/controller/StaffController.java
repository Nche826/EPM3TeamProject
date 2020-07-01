package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.domain.Store;
import com.cafe24.epm.service.StaffService;
import com.cafe24.epm.service.StoreService;

@Controller //김수지담당
public class StaffController { 
	
	@Autowired private StoreService storeService;
	@Autowired private StaffService staffService;
	
	//직원 삭제 처리 
	@PostMapping("/staffDelete")
	@ResponseBody
	public int staffDelete(Model model , @RequestParam(value="staffNames[]",required = false)String[] staffNames) {
		System.out.println("staffNames--->"+staffNames);
		System.out.println("=======직원 삭제 시작 ==========");
		int nul =0;
		int re = 0;
		for(String staff_code : staffNames) {
			System.out.println("사용자 삭제  :" +staff_code);
			nul=staffService.staffSetDel(staff_code);
			System.out.println("null 처리 여부 ==>"+nul);
			re = staffService.staffDelete(staff_code);
			System.out.println("삭제 여부 ==>"+re);
		}
		
		return re;
	}
	
	//직원 수정 처리
	@PostMapping("/staffUpdate")
	public String staffUpdate(Staff staff) {
		System.out.println("==========직원 수정 시작============");
		System.out.println("업데이트 할 내용 staff-->"+staff.toString());
		staffService.staffUpdate(staff);
		return "redirect:/staffList";
		
	}
	
	
	//직원 수정 화면 가져오기
	@GetMapping("/staffUpdate")
	public String staffUpdate(Model model,@RequestParam(name="staff_code",required = false) String staff_code) {
		System.out.println("staff_code--->"+staff_code);
		System.out.println("=======수정페이지 시작========");
		Staff staffSelect = staffService.getStaffSelect(staff_code);
		System.out.println("staffSelect-->"+staffSelect);
		System.out.println("==========================");
		model.addAttribute("staffSelect", staffSelect);
		
		return "setting/staffUpdate";
	}
	
	//직원등록 화면 처리 
	@PostMapping("/staffInsert")
	public String staffInsert(Staff staff){
		System.out.println("========매장 등록 시작 ==========");
		System.out.println(staff.toString());
		int i = staffService.addStaff(staff);
		System.out.println("직원 등록 처리 성공시 1이 떠야되요-->"+i);
		return "redirect:/staffList";
	}
	//직원 관리 리스트 화면
		@GetMapping("/staffList")
		public String staffList(Model model,Staff staff) {
			System.out.println("======모달에 들어갈 셀렉트 박스 매장 리스트 가져오기 시작 =====");
			List<Store> store_name = storeService.storeList();
			System.out.println("매장 리스트 --->"+store_name);
			System.out.println("===========================");
			model.addAttribute("store", store_name);
			System.out.println("=========직원 리스트 화면 컨트롤러 시작========");
			List<Staff> staffList = staffService.staffList();
			System.out.println("직원 리스트 ----->"+staffList);
			System.out.println("===========================");
			model.addAttribute("staffList", staffList);
			return "setting/staffList";
		}
}
