package com.cafe24.epm.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Staff;

@Mapper
public interface StaffMapper {
	
	//매장등록처리
	public int addStaff(Staff staff);

}
