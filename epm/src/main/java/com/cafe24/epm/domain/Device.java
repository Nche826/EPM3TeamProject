package com.cafe24.epm.domain;

public class Device {
	
	private String deviceCode;
	private String deviceSerial;
	private String deviceDealler;
	private String deviceDevice;
	private String deviceStatus;
	private String deviceStatDate;
	private String deviceDate;
	private String deviceMemo;
	private String deviceStaff;
	private String deviceRegDate;
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public String getDeviceSerial() {
		return deviceSerial;
	}
	public void setDeviceSerial(String deviceSerial) {
		this.deviceSerial = deviceSerial;
	}
	public String getDeviceDealler() {
		return deviceDealler;
	}
	public void setDeviceDealler(String deviceDealler) {
		this.deviceDealler = deviceDealler;
	}
	public String getDeviceDevice() {
		return deviceDevice;
	}
	public void setDeviceDevice(String deviceDevice) {
		this.deviceDevice = deviceDevice;
	}
	public String getDeviceStatus() {
		return deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	public String getDeviceStatDate() {
		return deviceStatDate;
	}
	public void setDeviceStatDate(String deviceStatDate) {
		this.deviceStatDate = deviceStatDate;
	}
	public String getDeviceDate() {
		return deviceDate;
	}
	public void setDeviceDate(String deviceDate) {
		this.deviceDate = deviceDate;
	}
	public String getDeviceMemo() {
		return deviceMemo;
	}
	public void setDeviceMemo(String deviceMemo) {
		this.deviceMemo = deviceMemo;
	}
	public String getDeviceStaff() {
		return deviceStaff;
	}
	public void setDeviceStaff(String deviceStaff) {
		this.deviceStaff = deviceStaff;
	}
	public String getDeviceRegDate() {
		return deviceRegDate;
	}
	public void setDeviceRegDate(String deviceRegDate) {
		this.deviceRegDate = deviceRegDate;
	}
	@Override
	public String toString() {
		return "Device [deviceCode=" + deviceCode + ", deviceSerial=" + deviceSerial + ", deviceDealler="
				+ deviceDealler + ", deviceDevice=" + deviceDevice + ", deviceStatus=" + deviceStatus
				+ ", deviceStatDate=" + deviceStatDate + ", deviceDate=" + deviceDate + ", deviceMemo=" + deviceMemo
				+ ", deviceStaff=" + deviceStaff + ", deviceRegDate=" + deviceRegDate + "]";
	}
		
	
	
}
