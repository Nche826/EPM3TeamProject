package com.cafe24.epm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.epm.domain.Device;

@Mapper
public interface DeviceMapper {

		public List<Device> deviceList();
		
		public Device deviceSelect(String deviceCode);

		public int deviceInsert(Device device);		
}

