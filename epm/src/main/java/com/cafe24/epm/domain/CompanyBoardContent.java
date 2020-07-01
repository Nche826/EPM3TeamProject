package com.cafe24.epm.domain;

public class CompanyBoardContent {
	private String companyCode;
	private String staffCode;
	private String staffName;
	private String companyCount;
	private String companyTitle;
	private String companyDesc;
	private String companyFile;
	private String companyDate;
	private String commentCount;
	private String storeName;
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getCompanyCount() {
		return companyCount;
	}
	public void setCompanyCount(String companyCount) {
		this.companyCount = companyCount;
	}
	public String getCompanyTitle() {
		return companyTitle;
	}
	public void setCompanyTitle(String companyTitle) {
		this.companyTitle = companyTitle;
	}
	public String getCompanyDesc() {
		return companyDesc;
	}
	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}
	public String getCompanyFile() {
		return companyFile;
	}
	public void setCompanyFile(String companyFile) {
		this.companyFile = companyFile;
	}
	public String getCompanyDate() {
		return companyDate;
	}
	public void setCompanyDate(String companyDate) {
		this.companyDate = companyDate;
	}
	public String getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompanyBoardContent [companyCode=");
		builder.append(companyCode);
		builder.append(", staffCode=");
		builder.append(staffCode);
		builder.append(", staffName=");
		builder.append(staffName);
		builder.append(", companyCount=");
		builder.append(companyCount);
		builder.append(", companyTitle=");
		builder.append(companyTitle);
		builder.append(", companyDesc=");
		builder.append(companyDesc);
		builder.append(", companyFile=");
		builder.append(companyFile);
		builder.append(", companyDate=");
		builder.append(companyDate);
		builder.append(", commentCount=");
		builder.append(commentCount);
		builder.append(", storeName=");
		builder.append(storeName);
		builder.append("]");
		return builder.toString();
	}

}
