package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Customer;

@Mapper
public interface CustomerMapper {
	
	//고객등록
	public int addCustomer(Customer customer);
	
	//고객리스트
	public List<Customer> CustomerList();

}
