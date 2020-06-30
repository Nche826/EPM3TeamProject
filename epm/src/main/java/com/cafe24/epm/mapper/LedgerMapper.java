package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Ledger;

@Mapper
public interface LedgerMapper {
	
	//수납 장부 리스트 
	public List<Ledger> ledgerList();
	
	//수납 등록 처리
	public int addLedger(Ledger ledger);

}
