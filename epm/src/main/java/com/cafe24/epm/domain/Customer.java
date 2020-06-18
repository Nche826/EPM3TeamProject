package com.cafe24.epm.domain;

public class Customer {

	private String customer_code ;
	private String customer_name ;
	private String customer_tel ;
	private int customer_birth ;
	private String staff_code ;
	private String customer_reg_date ;
	
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
	@Override
	public String toString() {
		return "Customer [customer_code=" + customer_code + ", customer_name=" + customer_name + ", customer_tel="
				+ customer_tel + ", customer_birth=" + customer_birth + ", staff_code=" + staff_code
				+ ", customer_reg_date=" + customer_reg_date + "]";
	}
	

}
