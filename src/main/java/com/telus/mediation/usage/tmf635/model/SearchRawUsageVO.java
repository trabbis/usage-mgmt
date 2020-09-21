package com.telus.mediation.usage.tmf635.model;

import java.util.Date;


public class SearchRawUsageVO extends ValueObject {
	private String fromDate;
	private String toDate;
	private String phoneNumber;
	private String serviceType;
	private String imsiNumber;
	private String imeiNumber;
	private String fileId;
	private String cgfServiceId;
	private String cellSiteId;
	private String multiplexId;
	private String mocnMccMncCd;
	private String recordTypeCd;
	private String radioAccessTechTypeCd;
	
	public String getRadioAccessTechTypeCd() {
		return radioAccessTechTypeCd;
	}
	public void setRadioAccessTechTypeCd(String radioAccessTechTypeCd) {
		this.radioAccessTechTypeCd = radioAccessTechTypeCd;
	}
	public String getRecordTypeCd() {
		return recordTypeCd;
	}
	public void setRecordTypeCd(String recordTypeCd) {
		this.recordTypeCd = recordTypeCd;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getImsiNumber() {
		return imsiNumber;
	}
	public void setImsiNumber(String imsiNumber) {
		this.imsiNumber = imsiNumber;
	}
	public String getImeiNumber() {
		return imeiNumber;
	}
	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getCgfServiceId() {
		return cgfServiceId;
	}
	public void setCgfServiceId(String cgfServiceId) {
		this.cgfServiceId = cgfServiceId;
	}
	public String getCellSiteId() {
		return cellSiteId;
	}
	public void setCellSiteId(String cellSiteId) {
		this.cellSiteId = cellSiteId;
	}
	public String getMultiplexId() {
		return multiplexId;
	}
	public void setMultiplexId(String multiplexId) {
		this.multiplexId = multiplexId;
	}
	public String getMocnMccMncCd() {
		return mocnMccMncCd;
	}
	public void setMocnMccMncCd(String mocnMccMncCd) {
		this.mocnMccMncCd = mocnMccMncCd;
	}
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("phoneNumber: ");
		buffer.append(phoneNumber);
		buffer.append(", ");

		buffer.append("serviceType: ");
		buffer.append(serviceType);
		buffer.append(", ");
		
		buffer.append("fromDate: ");
		buffer.append(fromDate);
		buffer.append(", ");

		buffer.append("toDate: ");
		buffer.append(toDate);
		buffer.append(", ");

		buffer.append("imsiNumber: ");
		buffer.append(imsiNumber);
		buffer.append(", ");

		buffer.append("imeiNumber: ");
		buffer.append(imeiNumber);
		buffer.append(", ");

		buffer.append("fileId: ");
		buffer.append(fileId);
		buffer.append(", ");

		buffer.append("cgfServiceId: ");
		buffer.append(cgfServiceId);
		buffer.append(", ");

		buffer.append("cellSiteId: ");
		buffer.append(cellSiteId);
		buffer.append(", ");

		buffer.append("multiplexId: ");
		buffer.append(multiplexId);
		buffer.append(", ");
		
		buffer.append("mocnMccMncCd: ");
		buffer.append(mocnMccMncCd);
		buffer.append(", ");

		buffer.append("recordTypeCd: ");
		buffer.append(recordTypeCd);
		
		return buffer.toString();
	}
	
	
}
