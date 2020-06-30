package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.mapper.StaffMapper;

@Service
public class StaffService {
	
	@Autowired private StaffMapper staffMapper;
	
	//매장 선택시 회원 출력하기
	public List<Staff> storeInStaff(String store_code){
		return staffMapper.storeInStaff(store_code);
	}
	
	//직원 삭제 전 null처리 하기
	public int staffSetDel(String staff_code) {
		return staffMapper.staffSetDel(staff_code);
	}
	//직원 삭제 처리
	public int staffDelete(String staff_code) {
		return staffMapper.staffDelete(staff_code);
	}
	
	//직원 권한 수정 처리
	public int staffUpdate(Staff staff) {
	 Staff result = staffMapper.getStaffSelect(staff.getMember_id());
	 System.out.println("result.toString()--->"+result.toString());
	 return staffMapper.staffUpdate(staff);
	}
	
	//직원수정 전 단계, 아이디값 가져오기
	public Staff getStaffSelect(String staff_id) {
		return staffMapper.getStaffSelect(staff_id);
	}
	
	//직원리스트
	public List<Staff> staffList(){
		return staffMapper.staffList();
	}
		
	//직원등록처리
	public int addStaff(Staff staff) {
		System.out.println("=====staff 등록 서비스 시작=====");
		return staffMapper.addStaff(staff);
	}
	
	//로그인용 직원 조회
	public List<Staff> staffSelectLogin(String staff_id) {
		return staffMapper.staffSelectLogin(staff_id);
	}

}
