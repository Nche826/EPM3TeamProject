package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //김수지담당
public class StaffController { 
	
	
	//직원 등록 화면
	@GetMapping("/staffInsert")
	public String staffInsert() {
		return "setting/staffInsert";
	}
	
	//직원 수정 화면
	@GetMapping("/staffUpdate")
	public String staffUpdate() {
		return "setting/staffUpdate";
	}
	
	//직원 관리 리스트 화면
	@GetMapping("/staffList")
	public String staffList() {
		return "setting/staffList";
	}
}
