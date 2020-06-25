package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.mapper.StaffMapper;

@Service
public class StaffService {
	
	@Autowired private StaffMapper staffMapper;
	
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

}
