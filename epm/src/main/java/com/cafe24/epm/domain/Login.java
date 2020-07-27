package com.cafe24.epm.domain;

public class Login {
	private String loginCode;
	private String memberId;
	private String loginDate;
	private String logoutDate;
	
	public String getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}
	public String getLogoutDate() {
		return logoutDate;
	}
	public void setLogoutDate(String logoutDate) {
		this.logoutDate = logoutDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Login [loginCode=");
		builder.append(loginCode);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", loginDate=");
		builder.append(loginDate);
		builder.append(", logoutDate=");
		builder.append(logoutDate);
		builder.append("]");
		return builder.toString();
	}
	
}
