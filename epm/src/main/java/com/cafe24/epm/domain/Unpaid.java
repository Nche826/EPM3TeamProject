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
	private String staffCode;
	private String memberName;	
	private String storeName;	
	private String unpaidRegDate;
	
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
		builder.append(", unpaidMemo=");
		builder.append(unpaidMemo);
		builder.append(", unpaidStatus=");
		builder.append(unpaidStatus);
		builder.append(", unpaidProDate=");
		builder.append(unpaidProDate);
		builder.append(", staffCode=");
		builder.append(staffCode);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", unpaidRegDate=");
		builder.append(unpaidRegDate);
		builder.append("]");
		return builder.toString();
	}
	
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
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getUnpaidRegDate() {
		return unpaidRegDate;
	}
	public void setUnpaidRegDate(String unpaidRegDate) {
		this.unpaidRegDate = unpaidRegDate;
	}
}
