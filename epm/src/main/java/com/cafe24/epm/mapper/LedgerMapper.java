package com.cafe24.epm.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Ledger;

@Mapper
public interface LedgerMapper {
	
	//수납 등록 처리
	public int addLedger(Ledger ledger);

}
