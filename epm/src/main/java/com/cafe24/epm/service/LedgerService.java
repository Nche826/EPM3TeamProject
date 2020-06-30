package com.cafe24.epm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Ledger;
import com.cafe24.epm.mapper.LedgerMapper;

@Service
public class LedgerService {
	
	@Autowired private LedgerMapper ledgerMapper;
	
	//수납장부 등록 처리
	public int addLedger(Ledger ledger) {
		return ledgerMapper.addLedger(ledger);
	}

}
