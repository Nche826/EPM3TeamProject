package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Used;

@Mapper
public interface UsedMapper {

		public List<Used> usedList();
		
		public List<Used> usedsearchList(Used used);
		
		public Used usedSelect(String usedCode);

		public int usedInsert(Used used);		
		
		public int usedInfoInsert(Used used);
		
		public int usedInfoUpdate(Used used);
		
		public int usedUpdate(Used used);
		
		public int usedDelete(Used used);
		
		public int usedInfoDelete(Used used);
}

