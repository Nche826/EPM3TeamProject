package com.cafe24.epm.domain;

public class Staff {

	private String staff_code;
	private String staff_id;
	private String store_code;
	private String store_name;
	private String staff_level;
	private String staff_reg_id;
	private String staff_reg_date;
	private String member_name;
	private String member_id;
	private String level_name;
	private String logout_date;
	private String count;
	
	
	
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getStaff_code() {
		return staff_code;
	}
	public void setStaff_code(String staff_code) {
		this.staff_code = staff_code;
	}
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	public String getStore_code() {
		return store_code;
	}
	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getStaff_level() {
		return staff_level;
	}
	public void setStaff_level(String staff_level) {
		this.staff_level = staff_level;
	}
	public String getStaff_reg_id() {
		return staff_reg_id;
	}
	public void setStaff_reg_id(String staff_reg_id) {
		this.staff_reg_id = staff_reg_id;
	}
	public String getStaff_reg_date() {
		return staff_reg_date;
	}
	public void setStaff_reg_date(String staff_reg_date) {
		this.staff_reg_date = staff_reg_date;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getLevel_name() {
		return level_name;
	}
	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}
	public String getLogout_date() {
		return logout_date;
	}
	public void setLogout_date(String logout_date) {
		this.logout_date = logout_date;
	}
	@Override
	public String toString() {
		return "Staff [staff_code=" + staff_code + ", staff_id=" + staff_id + ", store_code=" + store_code
				+ ", store_name=" + store_name + ", staff_level=" + staff_level + ", staff_reg_id=" + staff_reg_id
				+ ", staff_reg_date=" + staff_reg_date + ", member_name=" + member_name + ", member_id=" + member_id
				+ ", level_name=" + level_name + ", logout_date=" + logout_date + ", count=" + count + "]";
	}
	
	
	
}
