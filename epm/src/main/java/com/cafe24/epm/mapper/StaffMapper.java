package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Staff;

@Mapper
public interface StaffMapper {
	
	//직원리스트
	public List<Staff> staffList();
	
	//매장등록처리
	public int addStaff(Staff staff);

}
