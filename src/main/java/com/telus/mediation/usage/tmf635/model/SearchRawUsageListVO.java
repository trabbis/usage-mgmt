package com.telus.usage.mgmt.beans;


public class SearchRawUsageListVO extends ValueObject {
	private SearchRawUsageVO searchRawUsage;
	private TrafficDirectionTypeVO trafficDirection;
	private Long batchNumber;
	  
	public SearchRawUsageVO getSearchRawUsage() {
		return searchRawUsage;
	}
	public void setSearchRawUsage(SearchRawUsageVO searchRawUsage) {
		this.searchRawUsage = searchRawUsage;
	}
	public TrafficDirectionTypeVO getTrafficDirection() {
		return trafficDirection;
	}
	public void setTrafficDirection(TrafficDirectionTypeVO trafficDirection) {
		this.trafficDirection = trafficDirection;
	}
	public Long getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(Long batchNumber) {
		this.batchNumber = batchNumber;
	}
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("SearchRawUsageVO = ");
		buffer.append(searchRawUsage!=null?searchRawUsage.toString():"null");
		
		buffer.append(" || ");
		
		buffer.append("TrafficDirectionTypeVO = ");
		buffer.append(trafficDirection!=null?trafficDirection.toString():"null");		
		
		return buffer.toString();
	}
	
	
}
