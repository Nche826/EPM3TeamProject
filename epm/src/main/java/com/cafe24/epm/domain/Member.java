package com.cafe24.epm.domain;

public class Member {
	public String memberId;
	public String memberPw;
	public String memberName;
	public String memberTel;
	public String file;
	public String memberRegDate;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	public String getFile() {
		return file;
	}
	public void setMemberFile(String file) {
		this.file = file;
	}
	public String getMemberRegDate() {
		return memberRegDate;
	}
	public void setMemberRegDate(String memberRegDate) {
		this.memberRegDate = memberRegDate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [memberId=");
		builder.append(memberId);
		builder.append(", memberPw=");
		builder.append(memberPw);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", memberTel=");
		builder.append(memberTel);
		builder.append(", file=");
		builder.append(file);
		builder.append(", memberRegDate=");
		builder.append(memberRegDate);
		builder.append("]");
		return builder.toString();
	}
	
}
