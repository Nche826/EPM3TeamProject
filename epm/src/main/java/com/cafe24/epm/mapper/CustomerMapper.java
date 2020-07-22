package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Customer;
import com.cafe24.epm.domain.CustomerT;
import com.cafe24.epm.domain.Staff;

@Mapper
public interface CustomerMapper {
	
	//고객 이력 삭제 처리
	public int customerTDelete(String customertCodes);
	
	//고객 이력 화면 가져오기
	public List<CustomerT> CustomerTList();
	
	//검색처리
	public List<Customer> customerSch(String dateSch1,String dateSch2,String selectSch
									 ,String table_search);
	//고객삭제처리
	public int customerDelete(String customerCodes);
	
	//고객 수정 처리
	public int customerUpdate(Customer customer);
	
	//고객 수정시 매장 정보 불러오기
	public Customer getStaffSelect(String staff_code);
	
	//고객 수정 전단계
	public Customer getCustomerSelect(String customer_code);
	
	//고객등록
	public int addCustomer(Customer customer);
	
	//고객 등록시 직원 아이디 셀렉트 박스에 정보 값 불러오기
	public List<Customer> getStaffName();
	
	//고객리스트
	public List<Customer> CustomerList();

}
