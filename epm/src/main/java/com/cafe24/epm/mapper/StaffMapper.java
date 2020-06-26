package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Staff;

@Mapper
public interface StaffMapper {
	
	//직원 삭제 전 null 처리
	public int staffSetDel(String staff_code);
	
	//직원 삭제 처리
	public int staffDelete(String staff_code);
	
	//직원 수정 처리
	public int staffUpdate(Staff staff);
	
	//직원 수정 전단계, 아이디값 가져오기
	public Staff getStaffSelect(String staff_id);
	
	//직원리스트
	public List<Staff> staffList();
	
	//매장등록처리
	public int addStaff(Staff staff);

}
