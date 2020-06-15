package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //김수지담당
public class CalendarController {
		
	   //캘린더 화면 이동  
		@GetMapping("/unpaidCalender")
		public String unpaidCalender() {
			return "unpaid/unpaidCalender";
		}
}
