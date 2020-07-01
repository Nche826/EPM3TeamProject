package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Staff;

@Mapper
public interface StaffMapper {
	
	//매장 선택시 직원 출력
	public List<Staff> storeInStaff(String store_code);
	
	//직원 삭제 전 null 처리
	public int staffSetDel(String staff_code);
	
	//직원 삭제 처리
	public int staffDelete(String staff_code);
	
	//직원 수정 처리
	public int staffUpdate(Staff staff);
	
	//직원 수정 전단계, 아이디값 가져오기
	public Staff getStaffSelect(String staff_code);
	
	//직원리스트
	public List<Staff> staffList();
	
	//매장등록처리
	public int addStaff(Staff staff);
	
	//로그인용 직원 조회
	public List<Staff> staffSelectLogin(String staff_id);
}
