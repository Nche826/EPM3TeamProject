package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Customer;
import com.cafe24.epm.domain.Ledger;
import com.cafe24.epm.domain.LedgerT;

@Mapper
public interface LedgerMapper {
	
	
	//검색처리
	public List<Ledger> ledgerSch(String dateSch1,String dateSch2,String selectSch
										 ,String table_search);
	
	//수납 이력 리스트 조회
	public List<LedgerT> ledgerTList();
	
	//수납 상태 완료 처리
	public int ledgerEnd(String receive_code);
	
	//삭제처리
	public int ledgerDelete(String receive_code);
	
	//수정처리
	public int ledgerUpdate(Ledger ledger);
	
	//수납장부 수정 전단계, 코드값 가져오기
	public Ledger getLedgerSelect(String receive_code);
	
	//수납 장부 리스트 
	public List<Ledger> ledgerList();
	
	//수납 등록 처리
	public int addLedger(Ledger ledger);

}
