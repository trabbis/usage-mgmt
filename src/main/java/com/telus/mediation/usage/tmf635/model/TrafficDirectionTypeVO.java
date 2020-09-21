package com.telus.usage.mgmt.beans;


public class TrafficDirectionTypeVO extends ValueObject {
	private TrafficDirectionEnumerationVO trafficDirection;
	private Long usageVolumeFrom;
	private Long usageVolumeTo;
	
	public TrafficDirectionEnumerationVO getTrafficDirection() {
		return trafficDirection;
	}
	public void setTrafficDirection(TrafficDirectionEnumerationVO trafficDirection) {
		this.trafficDirection = trafficDirection;
	}
	public Long getUsageVolumeFrom() {
		return usageVolumeFrom;
	}
	public void setUsageVolumeFrom(Long usageVolumeFrom) {
		this.usageVolumeFrom = usageVolumeFrom;
	}
	public Long getUsageVolumeTo() {
		return usageVolumeTo;
	}
	public void setUsageVolumeTo(Long usageVolumeTo) {
		this.usageVolumeTo = usageVolumeTo;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
	
		buffer.append("usageVolumeFrom: ");
		buffer.append(usageVolumeFrom);
		buffer.append(", ");
		
		buffer.append("usageVolumeTo: ");
		buffer.append(usageVolumeTo);
		buffer.append(", ");

		buffer.append("trafficDirection: ");
		buffer.append(trafficDirection!=null?trafficDirection.getValue():"null");
		
		return buffer.toString();
	}
	
	
	
}
