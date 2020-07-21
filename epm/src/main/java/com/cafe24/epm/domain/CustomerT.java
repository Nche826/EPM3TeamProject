package com.cafe24.epm.domain;

public class CustomerT {
	private String customert_code;
	private String customert_status;
	private String customert_name;
	private String customert_tel;
	private String staff_code;
	private String customert_reg_date;
	private String staff_name;
	private String store_name;
	public String getCustomert_code() {
		return customert_code;
	}
	public void setCustomert_code(String customert_code) {
		this.customert_code = customert_code;
	}
	public String getCustomert_status() {
		return customert_status;
	}
	public void setCustomert_status(String customert_status) {
		this.customert_status = customert_status;
	}
	public String getCustomert_name() {
		return customert_name;
	}
	public void setCustomert_name(String customert_name) {
		this.customert_name = customert_name;
	}
	public String getCustomert_tel() {
		return customert_tel;
	}
	public void setCustomert_tel(String customert_tel) {
		this.customert_tel = customert_tel;
	}
	public String getStaff_code() {
		return staff_code;
	}
	public void setStaff_code(String staff_code) {
		this.staff_code = staff_code;
	}
	public String getCustomert_reg_date() {
		return customert_reg_date;
	}
	public void setCustomert_reg_date(String customert_reg_date) {
		this.customert_reg_date = customert_reg_date;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	@Override
	public String toString() {
		return "CustomerT [customert_code=" + customert_code + ", customert_status=" + customert_status
				+ ", customert_name=" + customert_name + ", customert_tel=" + customert_tel + ", staff_code="
				+ staff_code + ", customert_reg_date=" + customert_reg_date + ", staff_name=" + staff_name
				+ ", store_name=" + store_name + "]";
	}
	
	
	
}
