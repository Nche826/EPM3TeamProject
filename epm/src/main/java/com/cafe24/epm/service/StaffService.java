package com.cafe24.epm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Staff;
import com.cafe24.epm.mapper.StaffMapper;

@Service
public class StaffService {
	
	@Autowired private StaffMapper staffMapper;
	
	//직원등록처리
	public int addStaff(Staff staff) {
		System.out.println("=====staff 등록 서비스 시작=====");
		return staffMapper.addStaff(staff);
	}

}
