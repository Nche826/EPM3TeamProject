package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.epm.domain.Customer;
import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.mapper.CustomerMapper;

@Service
@Transactional
public class CustomerService {

	@Autowired private CustomerMapper customerMapper;
	
	//고객수정처리
	public int customerUpdate(Customer customer) {
	 Customer result = customerMapper.getCustomerSelect(customer.getCustomer_code());
	 System.out.println("result toString()---->"+result);
		return customerMapper.customerUpdate(customer);
	}
	
	//고객수정화면 가져오기
	public Customer getCustomerSelect(String customer_code) {
		return customerMapper.getCustomerSelect(customer_code);
	}
	
	//고객 담당 직원 정보 가져오기
	public Customer getStaffSelect(String staff_code) {
		return customerMapper.getStaffSelect(staff_code);
	}
	
	//고객등록
	public int addCustomer(Customer customer) {
		System.out.println("서비스 시작~!");
		return customerMapper.addCustomer(customer);
	}
	
	//고객리스트
	public List<Customer> CustomerList(){
		return customerMapper.CustomerList();
	}
}
