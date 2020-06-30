package com.cafe24.epm.domain;

public class CompanyBoardComment {
	private String companyCCode;
	private String companyCode;
	private String staffCode;
	private String staffName;
	private String companyCDesc;
	private String companyCDate;
	
	public String getCompanyCCode() {
		return companyCCode;
	}
	public void setCompanyCCode(String companyCCode) {
		this.companyCCode = companyCCode;
	}
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
	public String getCompanyCDesc() {
		return companyCDesc;
	}
	public void setCompanyCDesc(String companyCDesc) {
		this.companyCDesc = companyCDesc;
	}
	public String getCompanyCDate() {
		return companyCDate;
	}
	public void setCompanyCDate(String companyCDate) {
		this.companyCDate = companyCDate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompanyBoardComment [companyCCode=");
		builder.append(companyCCode);
		builder.append(", companyCode=");
		builder.append(companyCode);
		builder.append(", staffCode=");
		builder.append(staffCode);
		builder.append(", staffName=");
		builder.append(staffName);
		builder.append(", companyCDesc=");
		builder.append(companyCDesc);
		builder.append(", companyCDate=");
		builder.append(companyCDate);
		builder.append("]");
		return builder.toString();
	}
	
}
