package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.epm.domain.Customer;
import com.cafe24.epm.mapper.CustomerMapper;

@Service
@Transactional
public class CustomerService {

	@Autowired private CustomerMapper customerMapper;
	
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
