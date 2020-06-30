package com.cafe24.epm.domain;

public class Ledger {
	private String receive_code; //수납장부코드
	private String receive_type; //수납방식
	private String receive_customer; //수납자 명
	private String receive_custel; //수납자 연락처
	private String receive_price; //수납 금액
	private String receive_card;  //수납 카드명
	private String dealler_code; // 수납 거래처 코드
	private String receive_remit_date; // 송금일
	private String receive_remit_price; //송금액
	private String receive_remit_type;  //송금상태
	private String receive_memo;   //비고
	private String store_code;  //매장 코드
	private String staff_code;   //직원 코드
	private String receive_reg_date; //수납등록날짜
	private String dealler_name; //거래처명
	private String store_name; //매장명
	private String member_name;  //직원이름
	
	public String getReceive_code() {
		return receive_code;
	}
	public void setReceive_code(String receive_code) {
		this.receive_code = receive_code;
	}
	public String getReceive_type() {
		return receive_type;
	}
	public void setReceive_type(String receive_type) {
		this.receive_type = receive_type;
	}
	public String getReceive_customer() {
		return receive_customer;
	}
	public void setReceive_customer(String receive_customer) {
		this.receive_customer = receive_customer;
	}
	public String getReceive_custel() {
		return receive_custel;
	}
	public void setReceive_custel(String receive_custel) {
		this.receive_custel = receive_custel;
	}
	public String getReceive_price() {
		return receive_price;
	}
	public void setReceive_price(String receive_price) {
		this.receive_price = receive_price;
	}
	public String getReceive_card() {
		return receive_card;
	}
	public void setReceive_card(String receive_card) {
		this.receive_card = receive_card;
	}
	public String getDealler_code() {
		return dealler_code;
	}
	public void setDealler_code(String dealler_code) {
		this.dealler_code = dealler_code;
	}
	public String getReceive_remit_date() {
		return receive_remit_date;
	}
	public void setReceive_remit_date(String receive_remit_date) {
		this.receive_remit_date = receive_remit_date;
	}
	public String getReceive_remit_price() {
		return receive_remit_price;
	}
	public void setReceive_remit_price(String receive_remit_price) {
		this.receive_remit_price = receive_remit_price;
	}
	public String getReceive_remit_type() {
		return receive_remit_type;
	}
	public void setReceive_remit_type(String receive_remit_type) {
		this.receive_remit_type = receive_remit_type;
	}
	public String getReceive_memo() {
		return receive_memo;
	}
	public void setReceive_memo(String receive_memo) {
		this.receive_memo = receive_memo;
	}
	public String getStore_code() {
		return store_code;
	}
	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}
	public String getStaff_code() {
		return staff_code;
	}
	public void setStaff_code(String staff_code) {
		this.staff_code = staff_code;
	}
	public String getReceive_reg_date() {
		return receive_reg_date;
	}
	public void setReceive_reg_date(String receive_reg_date) {
		this.receive_reg_date = receive_reg_date;
	}
	public String getDealler_name() {
		return dealler_name;
	}
	public void setDealler_name(String dealler_name) {
		this.dealler_name = dealler_name;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	@Override
	public String toString() {
		return "Ledger [receive_code=" + receive_code + ", receive_type=" + receive_type + ", receive_customer="
				+ receive_customer + ", receive_custel=" + receive_custel + ", receive_price=" + receive_price
				+ ", receive_card=" + receive_card + ", dealler_code=" + dealler_code + ", receive_remit_date="
				+ receive_remit_date + ", receive_remit_price=" + receive_remit_price + ", receive_remit_type="
				+ receive_remit_type + ", receive_memo=" + receive_memo + ", store_code=" + store_code + ", staff_code="
				+ staff_code + ", receive_reg_date=" + receive_reg_date + ", dealler_name=" + dealler_name
				+ ", store_name=" + store_name + ", member_name=" + member_name + "]";
	}
	
	
	

}
