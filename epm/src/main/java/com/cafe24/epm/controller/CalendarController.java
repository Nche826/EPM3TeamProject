package com.cafe24.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {

		@GetMapping("/unpaidCalender")
		public String unpaidCalender() {
			return "unpaid/unpaidCalender";
		}
}
