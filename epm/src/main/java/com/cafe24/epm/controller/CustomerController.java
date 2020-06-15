package com.cafe24.epm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.epm.domain.Customer;
import com.cafe24.epm.service.CustomerService;

@Controller //김수지담당
public class CustomerController {
	
	@Autowired private CustomerService customerService;
	
	//고객등록하기
	@PostMapping("/addCustomer")
	public String addCustomer(Customer customer) {
		System.out.println("=======고객등록시작=======");
		System.out.println(customer.toString());
		int i = customerService.addCustomer(customer);
		System.out.println("실행결과 실행되면 1이 떠야되!!-->"+i);
		
		return "customer/customerList";
		
	}
	
	
	//고객이력화면 가져오기
	@GetMapping("/customerTList")
	public String customerTList() {
		return"customer/customerTList";
	}
	
	//고객수정화면 가져오기
	@GetMapping("/customerUpdate")
	public String customerUpdate() {
		return "customer/customerUpdate";
	}
	
	//고객리스트 화면 가져오기
	@GetMapping("/customerList")
	public String customerList() {
		return "customer/customerList";
	}
	

}
