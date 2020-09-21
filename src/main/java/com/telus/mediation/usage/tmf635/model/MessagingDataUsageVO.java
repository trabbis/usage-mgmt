package com.telus.usage.mgmt.beans;

import java.util.Date;



public class MessagingDataUsageVO extends ValueObject {
	private Double deliveryAttemptsCount;
	private String billIdsmppString;
	private String orgiAddressString;
	private String dgtiAddressString;
	private String messageLanguageCd;
	private String origPointCd;
	private String destPointCd;
	private Double teleserviceNum;
	private String billingMethod;
	private Date receiptDeliveryTime;
	private String messageNumberTypeCd;
	private String messageErrorTypeCd;
	private String messageDeliveryStatusCd;
	private String cbatPhoneNum;
	private String deliveryReceiptInd;
	private Double deliveryReceiptId;
	private Double sdfPartnerId;
	private String serviceTypeString;
	private String serviceNameString;
	private String sourceChargeAmount;
	private Double sdfProviderId;
	private Double sdfReferenceId;
	
	public Double getDeliveryAttemptsCount() {
		return deliveryAttemptsCount;
	}
	public void setDeliveryAttemptsCount(Double deliveryAttemptsCount) {
		this.deliveryAttemptsCount = deliveryAttemptsCount;
	}
	public String getBillIdsmppString() {
		return billIdsmppString;
	}
	public void setBillIdsmppString(String billIdsmppString) {
		this.billIdsmppString = billIdsmppString;
	}
	public String getOrgiAddressString() {
		return orgiAddressString;
	}
	public void setOrgiAddressString(String orgiAddressString) {
		this.orgiAddressString = orgiAddressString;
	}
	public String getDgtiAddressString() {
		return dgtiAddressString;
	}
	public void setDgtiAddressString(String dgtiAddressString) {
		this.dgtiAddressString = dgtiAddressString;
	}
	public String getMessageLanguageCd() {
		return messageLanguageCd;
	}
	public void setMessageLanguageCd(String messageLanguageCd) {
		this.messageLanguageCd = messageLanguageCd;
	}
	public String getOrigPointCd() {
		return origPointCd;
	}
	public void setOrigPointCd(String origPointCd) {
		this.origPointCd = origPointCd;
	}
	public String getDestPointCd() {
		return destPointCd;
	}
	public void setDestPointCd(String destPointCd) {
		this.destPointCd = destPointCd;
	}
	public Double getTeleserviceNum() {
		return teleserviceNum;
	}
	public void setTeleserviceNum(Double teleserviceNum) {
		this.teleserviceNum = teleserviceNum;
	}
	public String getBillingMethod() {
		return billingMethod;
	}
	public void setBillingMethod(String billingMethod) {
		this.billingMethod = billingMethod;
	}
	public Date getReceiptDeliveryTime() {
		return receiptDeliveryTime;
	}
	public void setReceiptDeliveryTime(Date receiptDeliveryTime) {
		this.receiptDeliveryTime = receiptDeliveryTime;
	}
	public String getMessageNumberTypeCd() {
		return messageNumberTypeCd;
	}
	public void setMessageNumberTypeCd(String messageNumberTypeCd) {
		this.messageNumberTypeCd = messageNumberTypeCd;
	}
	public String getMessageErrorTypeCd() {
		return messageErrorTypeCd;
	}
	public void setMessageErrorTypeCd(String messageErrorTypeCd) {
		this.messageErrorTypeCd = messageErrorTypeCd;
	}
	public String getMessageDeliveryStatusCd() {
		return messageDeliveryStatusCd;
	}
	public void setMessageDeliveryStatusCd(String messageDeliveryStatusCd) {
		this.messageDeliveryStatusCd = messageDeliveryStatusCd;
	}
	public String getCbatPhoneNum() {
		return cbatPhoneNum;
	}
	public void setCbatPhoneNum(String cbatPhoneNum) {
		this.cbatPhoneNum = cbatPhoneNum;
	}
	public String getDeliveryReceiptInd() {
		return deliveryReceiptInd;
	}
	public void setDeliveryReceiptInd(String deliveryReceiptInd) {
		this.deliveryReceiptInd = deliveryReceiptInd;
	}
	public Double getDeliveryReceiptId() {
		return deliveryReceiptId;
	}
	public void setDeliveryReceiptId(Double deliveryReceiptId) {
		this.deliveryReceiptId = deliveryReceiptId;
	}
	public Double getSdfPartnerId() {
		return sdfPartnerId;
	}
	public void setSdfPartnerId(Double sdfPartnerId) {
		this.sdfPartnerId = sdfPartnerId;
	}
	public String getServiceTypeString() {
		return serviceTypeString;
	}
	public void setServiceTypeString(String serviceTypeString) {
		this.serviceTypeString = serviceTypeString;
	}
	public String getServiceNameString() {
		return serviceNameString;
	}
	public void setServiceNameString(String serviceNameString) {
		this.serviceNameString = serviceNameString;
	}
	public String getSourceChargeAmount() {
		return sourceChargeAmount;
	}
	public void setSourceChargeAmount(String sourceChargeAmount) {
		this.sourceChargeAmount = sourceChargeAmount;
	}
	public Double getSdfProviderId() {
		return sdfProviderId;
	}
	public void setSdfProviderId(Double sdfProviderId) {
		this.sdfProviderId = sdfProviderId;
	}
	public Double getSdfReferenceId() {
		return sdfReferenceId;
	}
	public void setSdfReferenceId(Double sdfReferenceId) {
		this.sdfReferenceId = sdfReferenceId;
	}
}
