package com.cafe24.epm.domain;

public class Unpaid {
	private String unpaidCode;
	private String unpaidExpDate;
	private String unpaidPart;
	private String unpaidSubName;
	private String unpaidDesc;
	private String customerCode;
	private String customerName;
	private String customerTel;	
	private String unpaidMemo;
	private String unpaidStatus;
	private String unpaidProDate;
	private String unpaidProStaffCode;
	private String unpaidProMemberName;	
	private String unpaidProStoreName;	
	private String unpaidRegDate;
	private String unpaidRegStaffCode;
	private String unpaidRegMemberName;
	private String unpaidRegStoreName;
	
	public String getUnpaidCode() {
		return unpaidCode;
	}
	public void setUnpaidCode(String unpaidCode) {
		this.unpaidCode = unpaidCode;
	}
	public String getUnpaidExpDate() {
		return unpaidExpDate;
	}
	public void setUnpaidExpDate(String unpaidExpDate) {
		this.unpaidExpDate = unpaidExpDate;
	}
	public String getUnpaidPart() {
		return unpaidPart;
	}
	public void setUnpaidPart(String unpaidPart) {
		this.unpaidPart = unpaidPart;
	}
	public String getUnpaidSubName() {
		return unpaidSubName;
	}
	public void setUnpaidSubName(String unpaidSubName) {
		this.unpaidSubName = unpaidSubName;
	}
	public String getUnpaidDesc() {
		return unpaidDesc;
	}
	public void setUnpaidDesc(String unpaidDesc) {
		this.unpaidDesc = unpaidDesc;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerTel() {
		return customerTel;
	}
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	public String getUnpaidMemo() {
		return unpaidMemo;
	}
	public void setUnpaidMemo(String unpaidMemo) {
		this.unpaidMemo = unpaidMemo;
	}
	public String getUnpaidStatus() {
		return unpaidStatus;
	}
	public void setUnpaidStatus(String unpaidStatus) {
		this.unpaidStatus = unpaidStatus;
	}
	public String getUnpaidProDate() {
		return unpaidProDate;
	}
	public void setUnpaidProDate(String unpaidProDate) {
		this.unpaidProDate = unpaidProDate;
	}
	public String getUnpaidProStaffCode() {
		return unpaidProStaffCode;
	}
	public void setUnpaidProStaffCode(String unpaidProStaffCode) {
		this.unpaidProStaffCode = unpaidProStaffCode;
	}
	public String getUnpaidProMemberName() {
		return unpaidProMemberName;
	}
	public void setUnpaidProMemberName(String unpaidProMemberName) {
		this.unpaidProMemberName = unpaidProMemberName;
	}
	public String getUnpaidProStoreName() {
		return unpaidProStoreName;
	}
	public void setUnpaidProStoreName(String unpaidProStoreName) {
		this.unpaidProStoreName = unpaidProStoreName;
	}
	public String getUnpaidRegDate() {
		return unpaidRegDate;
	}
	public void setUnpaidRegDate(String unpaidRegDate) {
		this.unpaidRegDate = unpaidRegDate;
	}
	public String getUnpaidRegStaffCode() {
		return unpaidRegStaffCode;
	}
	public void setUnpaidRegStaffCode(String unpaidRegStaffCode) {
		this.unpaidRegStaffCode = unpaidRegStaffCode;
	}
	public String getUnpaidRegMemberName() {
		return unpaidRegMemberName;
	}
	public void setUnpaidRegMemberName(String unpaidRegMemberName) {
		this.unpaidRegMemberName = unpaidRegMemberName;
	}
	public String getUnpaidRegStoreName() {
		return unpaidRegStoreName;
	}
	public void setUnpaidRegStoreName(String unpaidRegStoreName) {
		this.unpaidRegStoreName = unpaidRegStoreName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Unpaid [unpaidCode=");
		builder.append(unpaidCode);
		builder.append(", unpaidExpDate=");
		builder.append(unpaidExpDate);
		builder.append(", unpaidPart=");
		builder.append(unpaidPart);
		builder.append(", unpaidSubName=");
		builder.append(unpaidSubName);
		builder.append(", unpaidDesc=");
		builder.append(unpaidDesc);
		builder.append(", customerCode=");
		builder.append(customerCode);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", customerTel=");
		builder.append(customerTel);
		builder.append(", unpaidMemo=");
		builder.append(unpaidMemo);
		builder.append(", unpaidStatus=");
		builder.append(unpaidStatus);
		builder.append(", unpaidProDate=");
		builder.append(unpaidProDate);
		builder.append(", unpaidProStaffCode=");
		builder.append(unpaidProStaffCode);
		builder.append(", unpaidProMemberName=");
		builder.append(unpaidProMemberName);
		builder.append(", unpaidProStoreName=");
		builder.append(unpaidProStoreName);
		builder.append(", unpaidRegDate=");
		builder.append(unpaidRegDate);
		builder.append(", unpaidRegStaffCode=");
		builder.append(unpaidRegStaffCode);
		builder.append(", unpaidRegMemberName=");
		builder.append(unpaidRegMemberName);
		builder.append(", unpaidRegStoreName=");
		builder.append(unpaidRegStoreName);
		builder.append("]");
		return builder.toString();
	}

}
