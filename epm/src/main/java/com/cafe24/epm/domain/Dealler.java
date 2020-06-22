package com.cafe24.epm.domain;

public class Dealler {
	private String deallerCode;
	private String deallerName;
	private String deallerStatus;
	private String deallerTelecom;
	private String deallerAddr;
	private String deallerTel;
	private String deallerManager;
	private String MemberId;
	private String deallerRegDate;
	public String getDeallerCode() {
		return deallerCode;
	}
	public void setDeallerCode(String deallerCode) {
		System.out.println(deallerCode + "<- setDeallerCode");
		this.deallerCode = deallerCode;
	}
	public String getDeallerName() {
		return deallerName;
	}
	public void setDeallerName(String deallerName) {
		System.out.println(deallerName + "<- setDeallerName");
		this.deallerName = deallerName;
	}
	public String getDeallerStatus() {
		return deallerStatus;
	}
	public void setDeallerStatus(String deallerStatus) {
		System.out.println(deallerStatus + "<- setDeallerStatus");
		this.deallerStatus = deallerStatus;
	}
	public String getDeallerTelecom() {
		return deallerTelecom;
	}
	public void setDeallerTelecom(String deallerTelecom) {
		System.out.println(deallerTelecom + "<- setDeallerTelecom");
		this.deallerTelecom = deallerTelecom;
	}
	public String getDeallerAddr() {
		return deallerAddr;
	}
	public void setDeallerAddr(String deallerAddr) {
		System.out.println(deallerAddr + "<- setDeallerAddr");
		this.deallerAddr = deallerAddr;
	}
	public String getDeallerTel() {
		return deallerTel;
	}
	public void setDeallerTel(String deallerTel) {
		System.out.println(deallerTel + "<- setDeallerTel");
		this.deallerTel = deallerTel;
	}
	public String getDeallerManager() {
		return deallerManager;
	}
	public void setDeallerManager(String deallerManager) {
		System.out.println(deallerManager + "<- setDeallerManager");
		this.deallerManager = deallerManager;
	}
	public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberId) {
		System.out.println(memberId + "<- setMemberId");
		MemberId = memberId;
	}
	public String getDeallerRegDate() {
		return deallerRegDate;
	}
	public void setDeallerRegDate(String deallerRegDate) {
		System.out.println(deallerRegDate + "<- setDeallerRegDate");
		this.deallerRegDate = deallerRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dealler [deallerCode=");
		builder.append(deallerCode);
		builder.append(", deallerName=");
		builder.append(deallerName);
		builder.append(", deallerStatus=");
		builder.append(deallerStatus);
		builder.append(", deallerTelecom=");
		builder.append(deallerTelecom);
		builder.append(", deallerAddr=");
		builder.append(deallerAddr);
		builder.append(", deallerTel=");
		builder.append(deallerTel);
		builder.append(", deallerManager=");
		builder.append(deallerManager);
		builder.append(", MemberId=");
		builder.append(MemberId);
		builder.append(", deallerRegDate=");
		builder.append(deallerRegDate);
		builder.append("]");
		return builder.toString();
	}

}
