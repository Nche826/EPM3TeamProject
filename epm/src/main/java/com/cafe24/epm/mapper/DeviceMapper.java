package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Device;

@Mapper
public interface DeviceMapper {

		public List<Device> deviceList();
		
		public List<Device> searchList();
		
		public Device deviceSelect(String deviceCode);

		public int deviceInsert(Device device);		
		
		public int deviceInfoInsert(Device device);
		
		public int deviceInfoUpdate(Device device);
		
		public int deviceUpdate(Device device);
		
		public int deviceDelete(Device device);
		
		public int deviceInfoDelete(Device device);
}

