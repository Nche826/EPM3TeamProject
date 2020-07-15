package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Ledger;
import com.cafe24.epm.mapper.LedgerMapper;

@Service
public class LedgerService {
	
	@Autowired private LedgerMapper ledgerMapper;
	
	//수납상태 완료 처리
	public int ledgerEnd(String receive_code) {
		return ledgerMapper.ledgerEnd(receive_code);
	}
	
	//수납장부 삭제처리
	public int ledgerDelete(String receive_code) {
		return ledgerMapper.ledgerDelete(receive_code);
	}
	
	//수납장부 수정처리
	public int ledgerUpdate(Ledger ledger) {
		Ledger result = ledgerMapper.getLedgerSelect(ledger.getReceive_code());
		System.out.println("result.toString-->"+result.toString());
		return ledgerMapper.ledgerUpdate(ledger);
	}
	
	//수납장부 수정 전단계, 코드값 가져오기
	public Ledger getLedgerSelect(String receive_code) {
		return ledgerMapper.getLedgerSelect(receive_code);
	}
	
	//수납 장부 리스트
	public List<Ledger> ledgerList(){
		return ledgerMapper.ledgerList();
	}
	
	//수납장부 등록 처리
	public int addLedger(Ledger ledger) {
		return ledgerMapper.addLedger(ledger);
	}

}
