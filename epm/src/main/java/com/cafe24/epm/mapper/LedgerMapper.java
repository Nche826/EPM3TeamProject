package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Ledger;

@Mapper
public interface LedgerMapper {
	
	
	//수정처리
	public int ledgerUpdate(Ledger ledger);
	
	//수납장부 수정 전단계, 코드값 가져오기
	public Ledger getLedgerSelect(String receive_code);
	
	//수납 장부 리스트 
	public List<Ledger> ledgerList();
	
	//수납 등록 처리
	public int addLedger(Ledger ledger);

}
