package com.cafe24.epm.domain;

public class Store {

	private String store_Code;
	private String store_Name;
	private String store_Addr;
	private String store_Tel;
	private String store_Reg_id;
	private String store_Reg_date;
	private String member_name;
	private String member_tel;
	private String staff_code;
	private String level_name;
	private String level_code;
	public String getStore_Code() {
		return store_Code;
	}
	public void setStore_Code(String store_Code) {
		this.store_Code = store_Code;
	}
	public String getStore_Name() {
		return store_Name;
	}
	public void setStore_Name(String store_Name) {
		this.store_Name = store_Name;
	}
	public String getStore_Addr() {
		return store_Addr;
	}
	public void setStore_Addr(String store_Addr) {
		this.store_Addr = store_Addr;
	}
	public String getStore_Tel() {
		return store_Tel;
	}
	public void setStore_Tel(String store_Tel) {
		this.store_Tel = store_Tel;
	}
	public String getStore_Reg_id() {
		return store_Reg_id;
	}
	public void setStore_Reg_id(String store_Reg_id) {
		this.store_Reg_id = store_Reg_id;
	}
	public String getStore_Reg_date() {
		return store_Reg_date;
	}
	public void setStore_Reg_date(String store_Reg_date) {
		this.store_Reg_date = store_Reg_date;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_tel() {
		return member_tel;
	}
	public void setMember_tel(String member_tel) {
		this.member_tel = member_tel;
	}
	public String getStaff_code() {
		return staff_code;
	}
	public void setStaff_code(String staff_code) {
		this.staff_code = staff_code;
	}
	public String getLevel_name() {
		return level_name;
	}
	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}
	public String getLevel_code() {
		return level_code;
	}
	public void setLevel_code(String level_code) {
		this.level_code = level_code;
	}
	@Override
	public String toString() {
		return "Store [store_Code=" + store_Code + ", store_Name=" + store_Name + ", store_Addr=" + store_Addr
				+ ", store_Tel=" + store_Tel + ", store_Reg_id=" + store_Reg_id + ", store_Reg_date=" + store_Reg_date
				+ ", member_name=" + member_name + ", member_tel=" + member_tel + ", staff_code=" + staff_code
				+ ", level_name=" + level_name + ", level_code=" + level_code + "]";
	}
	
	
	
}
