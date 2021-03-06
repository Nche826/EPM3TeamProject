package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.epm.domain.Customer;
import com.cafe24.epm.domain.CustomerT;
import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.mapper.CustomerMapper;

@Service
@Transactional
public class CustomerService {

	@Autowired private CustomerMapper customerMapper;
	
	//고객 이력 삭제 처리
	public int customerTDelete(String customertCodes) {
		return customerMapper.customerTDelete(customertCodes);
	}
	
	
	//고객이력화면처리
	public List<CustomerT> CustomerTList(){
		return customerMapper.CustomerTList();
	}
	
	//검색처리
	public List<Customer> customerSch(String dateSch1,String dateSch2 ,String selectSch
									,String table_search){
		return customerMapper.customerSch(dateSch1,dateSch2,selectSch, table_search);
	}; 
	
	//고객삭제처리
	public int customerDelete(String customerCodes) {
		return customerMapper.customerDelete(customerCodes);
	}
	
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
	
	//고객 등록시 직원 아이디 셀렉트 박스에 정보 값 불러오기
	public List<Customer> getStaffName() {
		return customerMapper.getStaffName();
	}
	
	//고객리스트
	public List<Customer> CustomerList(){
		return customerMapper.CustomerList();
	}
}
