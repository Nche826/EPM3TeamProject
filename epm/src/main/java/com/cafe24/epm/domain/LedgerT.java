package com.cafe24.epm.domain;

public class LedgerT {
	
	private String ledger_code;
	private String ledger_status;
	private String ledger_type;
	private String ledger_name;
	private String member_name;
	private String store_name;
	private String ledger_reg_date;
	
	public String getLedger_code() {
		return ledger_code;
	}
	public void setLedger_code(String ledger_code) {
		this.ledger_code = ledger_code;
	}
	public String getLedger_status() {
		return ledger_status;
	}
	public void setLedger_status(String ledger_status) {
		this.ledger_status = ledger_status;
	}
	public String getLedger_type() {
		return ledger_type;
	}
	public void setLedger_type(String ledger_type) {
		this.ledger_type = ledger_type;
	}
	public String getLedger_name() {
		return ledger_name;
	}
	public void setLedger_name(String ledger_name) {
		this.ledger_name = ledger_name;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getLedger_reg_date() {
		return ledger_reg_date;
	}
	public void setLedger_reg_date(String ledger_reg_date) {
		this.ledger_reg_date = ledger_reg_date;
	}
	
	@Override
	public String toString() {
		return "LedgerT [ledger_code=" + ledger_code + ", ledger_status=" + ledger_status + ", ledger_type="
				+ ledger_type + ", ledger_name=" + ledger_name + ", member_name=" + member_name + ", store_name="
				+ store_name + ", ledger_reg_date=" + ledger_reg_date + "]";
	}

	
}
