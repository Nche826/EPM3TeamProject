package com.cafe24.epm.domain;

public class UnpaidT {
	private String unpaidtCode;
	private String unpaidtRegStaffCode;
	private String storeName; 
	private String staffName; 
	private String unpaidtPart; 
	private String customerName; 
	private String customerTel; 
	private String unpaidtDesc; 
	private String unpaidtRegDate; 
	private String unpaidtMemo;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UnpaidT [unpaidtCode=");
		builder.append(unpaidtCode);
		builder.append(", unpaidtRegStaffCode=");
		builder.append(unpaidtRegStaffCode);
		builder.append(", storeName=");
		builder.append(storeName);
		builder.append(", staffName=");
		builder.append(staffName);
		builder.append(", unpaidtPart=");
		builder.append(unpaidtPart);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", customerTel=");
		builder.append(customerTel);
		builder.append(", unpaidtDesc=");
		builder.append(unpaidtDesc);
		builder.append(", unpaidtRegDate=");
		builder.append(unpaidtRegDate);
		builder.append(", unpaidtMemo=");
		builder.append(unpaidtMemo);
		builder.append("]");
		return builder.toString();
	}
	public String getUnpaidtCode() {
		return unpaidtCode;
	}
	public void setUnpaidtCode(String unpaidtCode) {
		this.unpaidtCode = unpaidtCode;
	}
	public String getUnpaidtRegStaffCode() {
		return unpaidtRegStaffCode;
	}
	public void setUnpaidtRegStaffCode(String unpaidtRegStaffCode) {
		this.unpaidtRegStaffCode = unpaidtRegStaffCode;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getUnpaidtPart() {
		return unpaidtPart;
	}
	public void setUnpaidtPart(String unpaidtPart) {
		this.unpaidtPart = unpaidtPart;
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
	public String getUnpaidtDesc() {
		return unpaidtDesc;
	}
	public void setUnpaidtDesc(String unpaidtDesc) {
		this.unpaidtDesc = unpaidtDesc;
	}
	public String getUnpaidtRegDate() {
		return unpaidtRegDate;
	}
	public void setUnpaidtRegDate(String unpaidtRegDate) {
		this.unpaidtRegDate = unpaidtRegDate;
	}
	public String getUnpaidtMemo() {
		return unpaidtMemo;
	}
	public void setUnpaidtMemo(String unpaidtMemo) {
		this.unpaidtMemo = unpaidtMemo;
	} 
}
