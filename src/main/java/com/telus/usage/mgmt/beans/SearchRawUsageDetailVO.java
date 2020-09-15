package com.telus.usage.mgmt.beans;

import java.util.Date;

public class SearchRawUsageDetailVO extends ValueObject {
	private Long dataServiceEventId;
	private Date dataServiceEventTime;
	private String dataServiceEventTypeCd;
	
	public Long getDataServiceEventId() {
		return dataServiceEventId;
	}
	public void setDataServiceEventId(Long dataServiceEventId) {
		this.dataServiceEventId = dataServiceEventId;
	}
	public Date getDataServiceEventTime() {
		return dataServiceEventTime;
	}
	public void setDataServiceEventTime(Date dataServiceEventTime) {
		this.dataServiceEventTime = dataServiceEventTime;
	}
	public String getDataServiceEventTypeCd() {
		return dataServiceEventTypeCd;
	}
	public void setDataServiceEventTypeCd(String dataServiceEventTypeCd) {
		this.dataServiceEventTypeCd = dataServiceEventTypeCd;
	}	
}
