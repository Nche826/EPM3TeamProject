package com.cafe24.epm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.epm.domain.Device;
import com.cafe24.epm.mapper.DeviceMapper;

@Service
public class DeviceService {
	@Autowired private DeviceMapper deviceMapper;
	
	public Device deviceSelect(String deviceCode) {
		return deviceMapper.deviceSelect(deviceCode);
	}
	
	public List<Device>	deviceList(){
		return deviceMapper.deviceList();
	}
	
	public List<Device>	searchList(){
		return deviceMapper.searchList();
	}

	public int deviceInsert(Device device) {
		return deviceMapper.deviceInsert(device);
	}
	
	public int deviceInfoInsert(Device device) {
		return deviceMapper.deviceInfoInsert(device);
	}
	
	public int deviceInfoUpdate(Device device) {
		return deviceMapper.deviceInfoUpdate(device);
	}
	
	public int deviceUpdate(Device device) {
		return deviceMapper.deviceUpdate(device);
	}
	
	public int deviceDelete(Device device) {
		return deviceMapper.deviceDelete(device);
	}
	
	public int deviceInfoDelete(Device device) {
		return deviceMapper.deviceInfoDelete(device);
	}
	
}
