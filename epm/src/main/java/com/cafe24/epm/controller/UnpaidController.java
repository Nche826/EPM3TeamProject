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
import com.cafe24.epm.domain.Unpaid;
import com.cafe24.epm.domain.UnpaidT;
import com.cafe24.epm.service.StaffService;
import com.cafe24.epm.service.UnpaidService;

@Controller
public class UnpaidController {
	@Autowired UnpaidService unpaidService;
	@Autowired StaffService staffService;
	
	@GetMapping("/unpaidTSearch")
	public String unpaidTSearch(Model model, @RequestParam(name="searchD1", required = false) String searchD1
			, @RequestParam(name="searchD2", required = false) String searchD2
			, @RequestParam(name="statusSearch", required = false) String statusSearch
			, @RequestParam(name="subjectSearch", required = false) String subjectSearch
			, @RequestParam(name="staffSearch", required = false) String staffSearch
			, @RequestParam(name="searchK", required = false) String searchK
			, @RequestParam(name="searchV", required = false) String searchV) {
		System.out.println("searchD1,searchD2,statusSearch,subjectSearch,staffSearch,searchK,searchV:"+searchD1+searchD2+statusSearch+subjectSearch+staffSearch+searchK+searchV);
		List<Unpaid> unpaidTList = unpaidService.unpaidTSearch(searchD1,searchD2,statusSearch,subjectSearch,staffSearch,searchK,searchV);
		model.addAttribute("unpaidTList",unpaidTList);
		List<Staff> staffList = staffService.staffList();
		model.addAttribute("staffList",staffList);
		return "unpaid/unpaidTList";
	}
	
	@GetMapping("/unpaidSearch")
	public String unpaidSearch(Model model, @RequestParam(name="searchD1", required = false) String searchD1
										  , @RequestParam(name="searchD2", required = false) String searchD2
										  , @RequestParam(name="statusSearch", required = false) String statusSearch
										  , @RequestParam(name="subjectSearch", required = false) String subjectSearch
										  , @RequestParam(name="staffSearch", required = false) String staffSearch
										  , @RequestParam(name="searchK", required = false) String searchK
										  , @RequestParam(name="searchV", required = false) String searchV) {
		List<Unpaid> unpaidList = unpaidService.unpaidSearch(searchD1,searchD2,statusSearch,subjectSearch,staffSearch,searchK,searchV);
		model.addAttribute("unpaidList",unpaidList);
		List<Staff> staffList = staffService.staffList();
		model.addAttribute("staffList",staffList);
		return "unpaid/unpaidList";
	}
	
	@GetMapping("/unpaidInsert")
	public String unpaidInsert() {
		return "unpaid/unpaidInsert";
	}
	
	@PostMapping("/unpaidInsert") 
	public String unpaidInsert(Unpaid unpaid) {
		unpaidService.unpaidInsert(unpaid);
	  return "redirect:/unpaidList";
	  }
	 
	@GetMapping("/unpaidList")
	public String unpaidList(Model model) {
		System.out.println("=====UnpaidController unpaidList=====");
		List<Unpaid> unpaidList = unpaidService.unpaidList();
		model.addAttribute("unpaidList",unpaidList);
		List<Staff> staffList = staffService.staffList();
		model.addAttribute("staffList",staffList);
		return "unpaid/unpaidList";
	}
	
	@PostMapping(value = "/unpaidSelect", produces = "application/json")
	@ResponseBody
	public Unpaid unpaidSelect(String unpaidCode) {
	  return unpaidService.unpaidSelect(unpaidCode);
	  }

	@PostMapping("/unpaidPro")
	public String unpaidPro(String unpaidCode, String unpaidProMemberName, String unpaidProStoreName) {
		unpaidService.unpaidPro(unpaidCode, unpaidProMemberName, unpaidProStoreName);
		return "redirect:/unpaidList";
	}
	
	@PostMapping("/unpaidUpdate")
	public String unpaidUpdate(Unpaid unpaid) {
		unpaidService.unpaidUpdate(unpaid);
		return "redirect:/unpaidList";
	}
	
	@PostMapping("/unpaidDelete")
	public String unpaidDelete (String unpaidCode) {
		unpaidService.unpaidDelete(unpaidCode);
		return "redirect:/unpaidList";
	}
	
	@GetMapping("/unpaidTList")
	public String unpaidTList(Model model) {
		List<UnpaidT> unpaidTList = unpaidService.unpaidTList();
		model.addAttribute("unpaidTList",unpaidTList);
		List<Staff> staffList = staffService.staffList();
		model.addAttribute("staffList",staffList);
		return "unpaid/unpaidTList";
	}
	
	@GetMapping("/unpaidTDelete")
	public String unpaidTDelete(@RequestParam (name = "unpaidt_code", required = false) String unpaidtCode) {
		unpaidService.unpaidTDelete(unpaidtCode);
		return "redirect:/unpaidTList";		
	}
}
