package com.telus.mediation.usage.tmf635.model;


public class RawUsageDetailResponseVO extends ValueObject {
	private DataServiceEventVO rawUsageDetail;

	public DataServiceEventVO getRawUsageDetail() {
		return rawUsageDetail;
	}

	public void setRawUsageDetail(DataServiceEventVO rawUsageDetail) {
		this.rawUsageDetail = rawUsageDetail;
	}
}
