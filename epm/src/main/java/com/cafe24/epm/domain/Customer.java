package com.cafe24.epm.domain;

public class Customer {

	private String customer_code ;
	private String customer_name ;
	private String customer_tel ;
	private int customer_birth ;
	private String staff_code ;
	private String customer_reg_date ;
	private String member_name;
	private String member_id;
	private String store_name;
	private String devopen_customer;
	private String homeopen_customer;
	private String store_addr;
	private String store_tel;
	
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_tel() {
		return customer_tel;
	}
	public void setCustomer_tel(String customer_tel) {
		this.customer_tel = customer_tel;
	}
	public int getCustomer_birth() {
		return customer_birth;
	}
	public void setCustomer_birth(int customer_birth) {
		this.customer_birth = customer_birth;
	}
	public String getStaff_code() {
		return staff_code;
	}
	public void setStaff_code(String staff_code) {
		this.staff_code = staff_code;
	}
	public String getCustomer_reg_date() {
		return customer_reg_date;
	}
	public void setCustomer_reg_date(String customer_reg_date) {
		this.customer_reg_date = customer_reg_date;
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
	public String getDevopen_customer() {
		return devopen_customer;
	}
	public void setDevopen_customer(String devopen_customer) {
		this.devopen_customer = devopen_customer;
	}
	public String getHomeopen_customer() {
		return homeopen_customer;
	}
	public void setHomeopen_customer(String homeopen_customer) {
		this.homeopen_customer = homeopen_customer;
	}
	public String getStore_addr() {
		return store_addr;
	}
	public void setStore_addr(String store_addr) {
		this.store_addr = store_addr;
	}
	public String getStore_tel() {
		return store_tel;
	}
	public void setStore_tel(String store_tel) {
		this.store_tel = store_tel;
	}
	@Override
	public String toString() {
		return "Customer [customer_code=" + customer_code + ", customer_name=" + customer_name + ", customer_tel="
				+ customer_tel + ", customer_birth=" + customer_birth + ", staff_code=" + staff_code
				+ ", customer_reg_date=" + customer_reg_date + ", member_name=" + member_name + ", member_id="
				+ member_id + ", store_name=" + store_name + ", devopen_customer=" + devopen_customer
				+ ", homeopen_customer=" + homeopen_customer + ", store_addr=" + store_addr + ", store_tel=" + store_tel
				+ "]";
	}
	

	
}
