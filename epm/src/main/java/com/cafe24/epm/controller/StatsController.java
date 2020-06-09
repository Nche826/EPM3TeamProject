package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatsController {
	//일일 통계 리스트
	@GetMapping("/statsOnedayReport")
	public String statsOnedayReport(Model model) {
		model.addAttribute("title", "일간 통계");
		return "/stats/statsOnedayReport";
	}
	
	//월별 통계 리스트
		@GetMapping("/statsMonthReport")
		public String statsMonthReport(Model model) {
			model.addAttribute("title", "월간 통계");
			return "/stats/statsMonthReport";
	}
		
	//매장별 통계 리스트
	@GetMapping("/statsStoreReport")
	public String statsStoreReport(Model model) {
		model.addAttribute("title", "매장 통계");
		return "/stats/statsStoreReport";
	}
		
	//직원별 통계 리스트
	@GetMapping("/statsStaffReport")
	public String statsStaffReport(Model model) {
		model.addAttribute("title", "직원 통계");
		return "/stats/statsStaffReport";
	}
}
