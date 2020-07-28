package com.cafe24.epm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.epm.domain.Customer;
import com.cafe24.epm.domain.CustomerT;
import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.service.CustomerService;
import com.cafe24.epm.service.StaffService;

@Controller //김수지담당
public class CustomerController {
	
	@Autowired private CustomerService customerService;
	@Autowired private StaffService staffService;
	
	
	//고객이력화면 가져오기
	@GetMapping("/customerTList")
	public String customerTList(Model model,CustomerT customerT ) {
		System.out.println("========고객 이력 화면 시작 =========");
		List<CustomerT> customerTList = customerService.CustomerTList();
		model.addAttribute("customerTList", customerTList);
		System.out.println("이력 리스트 --->"+customerTList);
		return"customer/customerTList";
	}
	
	//고객이력삭제처리
	@PostMapping("/customerTDelete")
	@ResponseBody
	public int customerTDelete(Model model, @RequestParam(value="customertCodes[]",required = false)String[] customertCodes) {
		System.out.println("customertCodes"+customertCodes);
		System.out.println("=========고객 이력 삭제 시작===========");
		int re = 0;
		for(String customert_code : customertCodes) {
			System.out.println("이력 삭제 :"+customert_code);
			re=customerService.customerTDelete(customert_code);
			System.out.println("삭제여부 --->"+re);
			
		}
		return re;
	}
	
	//고객삭제처리
	@PostMapping("/customerDelete")
	@ResponseBody
	public int customerDelete(Model model , @RequestParam(value="customerCodes[]",required = false)String[] customerCodes) {
		System.out.println("customerCodes"+customerCodes);
		System.out.println("=============고객 삭제 시작=============");
		int re =0;
		for(String customer_code : customerCodes) { 
			System.out.println("고객 삭제 :"+customer_code);
			re=customerService.customerDelete(customer_code);
			System.out.println("삭제여부--->"+re);
		}
		return re;
	}
	
	//고객등록하기
	@PostMapping("/addCustomer")
	public String addCustomer(Customer customer) {
		System.out.println("=======고객등록시작=======");
		System.out.println(customer.toString());
		int i = customerService.addCustomer(customer);
		System.out.println("실행결과 실행되면 1이 떠야되!!-->"+i);
		
		return "redirect:/customerList";
		
	}
	
	
	
	//고객 수정 처리
	@PostMapping("/customerUpdate")
	public String customerUpdate(Customer customer) {
		System.out.println("========고객 수정 시작==========");
		System.out.println("업데이트 할 내용 --->"+customer.toString());
		customerService.customerUpdate(customer);
		return "redirect:/customerList";
		
	}
	
	//고객수정화면 가져오기
	@GetMapping("/customerUpdate")
	public String customerUpdate(Model model,@RequestParam(name="customer_code",required = false) String customer_code
											,@RequestParam(name="staff_code",required = false)String staff_code) {
		System.out.println("customer_code --->"+customer_code);
		System.out.println("===========수정 페이지 시작============");
		Customer customerSelect = customerService.getCustomerSelect(customer_code);
		System.out.println("customerSelect--->"+customerSelect);
		model.addAttribute("customerSelect", customerSelect);
		System.out.println("==============매장 정보 불러오기==============");
		System.out.println("staff_code--->" +staff_code);
		Customer staffSelect = customerService.getStaffSelect(staff_code);
		System.out.println("staffSelect--->"+staffSelect);
		model.addAttribute("staffSelect", staffSelect);
		return "customer/customerUpdate";
	}
	
	//검색 결과 리스트 가져오기
	@GetMapping("/customerSch")
	public String customerSch(Model model,@RequestParam(name="dateSch1",required = false) String dateSch1
										 ,@RequestParam(name="dateSch2",required = false) String dateSch2
										 ,@RequestParam(name="selectSch",required = false) String selectSch
										 ,@RequestParam(name="table_search",required = false) String table_search) {
		System.out.println("=======검색 처리 시작 ========");
		System.out.println("검색 날짜 :"+dateSch1+dateSch2);
		System.out.println("검색 조건 : "+selectSch);
		System.out.println("검색어 : "+table_search);
		List<Customer> schList = customerService.customerSch(dateSch1, dateSch2,selectSch, table_search);
		model.addAttribute("schList", schList);
		System.out.println("======모달 내 셀렉트박스 직원아이디 목록 가져오기=====");
		List<Customer> staff_id = customerService.getStaffName();
		System.out.println("직원 리스트 --->"+ staff_id);
		model.addAttribute("staff", staff_id);
		System.out.println("=====================================");
		return "customer/customerList";
	}
	
	//고객리스트 화면 가져오기
	@GetMapping("/customerList")
	public String customerList(Model model,Customer customer ) {
		System.out.println("======모달 내 셀렉트박스 직원아이디 목록 가져오기=====");
		List<Customer> staff_id = customerService.getStaffName();
		System.out.println("직원 리스트 --->"+ staff_id);
		model.addAttribute("staff", staff_id);
		System.out.println("=====================================");
		System.out.println("==========고객 리스트 화면 가져오기===========");
		List<Customer> customerList = customerService.CustomerList();
		System.out.println("고객 리스트 --->"+customerList);
		model.addAttribute("customerList", customerList);
		System.out.println("======================================");
		return "customer/customerList";
	}
	

}
