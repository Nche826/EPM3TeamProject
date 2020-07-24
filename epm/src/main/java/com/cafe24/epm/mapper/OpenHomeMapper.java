package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.OpenHome;

@Mapper
public interface OpenHomeMapper {

		public List<OpenHome> openHomeList();

		public List<OpenHome> openHomeTList();
		
		public List<OpenHome> openHomesearchList(OpenHome openHome);

		public List<OpenHome> openHomeTsearchList(OpenHome openHome);
		
		public OpenHome openHomeSelect(String openHomeCode);

		public int openHomeInsert(OpenHome openHome);		
		
		public int openHomeInfoInsert(OpenHome openHome);
		
		public int openHomeInfoUpdate(OpenHome openHome);
		
		public int openHomeUpdate(OpenHome openHome);
		
		public int openHomeDelete(OpenHome openHome);
		
		public int openHomeInfoDelete(OpenHome openHome);
}

