package com.telus.bill.repository;

import java.util.Date;



public class DataServiceEventVO extends ValueObject {
	private String chargingId;
	private String contentDeliveredInd;
	private Double contentDownloadByteQuantity;
	private Double deviceDownloadGBQuantity;
	private Double contentSizeQuantity;
	private Double contentUploadByteQuantity;
	private Double deviceUploadGBQuantity;
	private Long dataServiceEventId;
	private Date dataServiceEventTime;
	private String dataServiceEventTypeCd;
	private Double deviceDownloadByteQuantity;
	private Double deviceUploadByteQuantity;
	private String phoneNumber;////NPA + NXX + Line Number eventInitiatorPhoneNum : TelephoneNumberType
	private String hostDomainName;
	private String imsiNum;
	private String mccMncCd;
	private Long mediationTransactionId;
	private String minNum;
	private String nasIpString;
	private Long networkFileId;
	private Double recordCorrelationId;
	private Double recordDuplicateCheckNum;
	private String recordId;
	private String recordTypeCd;
	private String requestedURLString;
	private String serviceBidId;
	private Double serviceDurationSecQuantity;
	private String serviceTechnolgyCd;
	private String servingNetworkString;
	private String servingSidId;
	private String sessionDomainName;
	private String sGSNAddressString;
	private String sourceNetworkCd;
	private String statusRequestCd;
	private String statusResponseCd;
	private String subSidId;
	private String userLoginText;
	
	
	private String accessPointNameNetworkString;
	private String accountingPlanName;
	private String artistName;	
	private String cellSiteId;
	private String chargingCharacterCd;
	private String chargingGatewayFunctionServiceId;
	private String chargingResultCd;
	private String contentURLString;
	private String createUserId;
	private String furnishChargingCd;
	private String genre;
	private String gGSNAddressString;
	private String imeiNum;
	private String locationAreaCd;
	private String mocnMccMncCd;
	private String multiplexId;
	private String otherPartyPhoneNum;
	private Date recordClosingTime;
	private Double recordSequenceNum;
	private String recordStatusCd;
	private String serviceAreaCd;
	private String terminationReasonCd;
	private String titleName;	
	
	private Date createTime;
	
	private String radioAccessTechTypeCd;
	
	private String networkTypeCd;
	
	private java.lang.String servedPacketDataProtocolAddressTxt;

	  public java.lang.String getServedPacketDataProtocolAddressTxt() {
	    return this.servedPacketDataProtocolAddressTxt;
	  }

	  public void setServedPacketDataProtocolAddressTxt(java.lang.String servedPacketDataProtocolAddressTxt) {
	    this.servedPacketDataProtocolAddressTxt = servedPacketDataProtocolAddressTxt;
	  }
	  
	public String getRadioAccessTechTypeCd() {
		return radioAccessTechTypeCd;
	}

	public void setRadioAccessTechTypeCd(String radioAccessTechTypeCd) {
		this.radioAccessTechTypeCd = radioAccessTechTypeCd;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	private RawDataUsageDetailVO rawDataUsageDetail;

	public DataServiceEventVO(){
		rawDataUsageDetail = new RawDataUsageDetailVO(); 
	}
	
	public Double getDeviceDownloadGBQuantity() {
		return deviceDownloadGBQuantity;
	}

	public void setDeviceDownloadGBQuantity(Double deviceDownloadGBQuantity) {
		this.deviceDownloadGBQuantity = deviceDownloadGBQuantity;
	}

	public Double getDeviceUploadGBQuantity() {
		return deviceUploadGBQuantity;
	}

	public void setDeviceUploadGBQuantity(Double deviceUploadGBQuantity) {
		this.deviceUploadGBQuantity = deviceUploadGBQuantity;
	}
	
	public String getChargingId() {
		return chargingId;
	}

	public void setChargingId(String chargingId) {
		this.chargingId = chargingId;
	}

	public String getContentDeliveredInd() {
		return contentDeliveredInd;
	}

	public void setContentDeliveredInd(String contentDeliveredInd) {
		this.contentDeliveredInd = contentDeliveredInd;
	}

	public Double getContentDownloadByteQuantity() {
		return contentDownloadByteQuantity;
	}

	public void setContentDownloadByteQuantity(Double contentDownloadByteQuantity) {
		this.contentDownloadByteQuantity = contentDownloadByteQuantity;
	}

	public Double getContentSizeQuantity() {
		return contentSizeQuantity;
	}

	public void setContentSizeQuantity(Double contentSizeQuantity) {
		this.contentSizeQuantity = contentSizeQuantity;
	}

	public Double getContentUploadByteQuantity() {
		return contentUploadByteQuantity;
	}

	public void setContentUploadByteQuantity(Double contentUploadByteQuantity) {
		this.contentUploadByteQuantity = contentUploadByteQuantity;
	}

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

	public Double getDeviceDownloadByteQuantity() {
		return deviceDownloadByteQuantity;
	}

	public void setDeviceDownloadByteQuantity(Double deviceDownloadByteQuantity) {
		this.deviceDownloadByteQuantity = deviceDownloadByteQuantity;
	}

	public Double getDeviceUploadByteQuantity() {
		return deviceUploadByteQuantity;
	}

	public void setDeviceUploadByteQuantity(Double deviceUploadByteQuantity) {
		this.deviceUploadByteQuantity = deviceUploadByteQuantity;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHostDomainName() {
		return hostDomainName;
	}

	public void setHostDomainName(String hostDomainName) {
		this.hostDomainName = hostDomainName;
	}

	public String getImsiNum() {
		return imsiNum;
	}

	public void setImsiNum(String imsiNum) {
		this.imsiNum = imsiNum;
	}

	public String getMccMncCd() {
		return mccMncCd;
	}

	public void setMccMncCd(String mccMncCd) {
		this.mccMncCd = mccMncCd;
	}

	public Long getMediationTransactionId() {
		return mediationTransactionId;
	}

	public void setMediationTransactionId(Long mediationTransactionId) {
		this.mediationTransactionId = mediationTransactionId;
	}

	public String getMinNum() {
		return minNum;
	}

	public void setMinNum(String minNum) {
		this.minNum = minNum;
	}

	public String getNasIpString() {
		return nasIpString;
	}

	public void setNasIpString(String nasIpString) {
		this.nasIpString = nasIpString;
	}

	public Long getNetworkFileId() {
		return networkFileId;
	}

	public void setNetworkFileId(Long networkFileId) {
		this.networkFileId = networkFileId;
	}

	public Double getRecordCorrelationId() {
		return recordCorrelationId;
	}

	public void setRecordCorrelationId(Double recordCorrelationId) {
		this.recordCorrelationId = recordCorrelationId;
	}

	public Double getRecordDuplicateCheckNum() {
		return recordDuplicateCheckNum;
	}

	public void setRecordDuplicateCheckNum(Double recordDuplicateCheckNum) {
		this.recordDuplicateCheckNum = recordDuplicateCheckNum;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordTypeCd() {
		return recordTypeCd;
	}

	public void setRecordTypeCd(String recordTypeCd) {
		this.recordTypeCd = recordTypeCd;
	}

	public String getRequestedURLString() {
		return requestedURLString;
	}

	public void setRequestedURLString(String requestedURLString) {
		this.requestedURLString = requestedURLString;
	}

	public String getServiceBidId() {
		return serviceBidId;
	}

	public void setServiceBidId(String serviceBidId) {
		this.serviceBidId = serviceBidId;
	}

	public Double getServiceDurationSecQuantity() {
		return serviceDurationSecQuantity;
	}

	public void setServiceDurationSecQuantity(Double serviceDurationSecQuantity) {
		this.serviceDurationSecQuantity = serviceDurationSecQuantity;
	}

	public String getServiceTechnolgyCd() {
		return serviceTechnolgyCd;
	}

	public void setServiceTechnolgyCd(String serviceTechnolgyCd) {
		this.serviceTechnolgyCd = serviceTechnolgyCd;
	}

	public String getServingNetworkString() {
		return servingNetworkString;
	}

	public void setServingNetworkString(String servingNetworkString) {
		this.servingNetworkString = servingNetworkString;
	}

	public String getServingSidId() {
		return servingSidId;
	}

	public void setServingSidId(String servingSidId) {
		this.servingSidId = servingSidId;
	}

	public String getSessionDomainName() {
		return sessionDomainName;
	}

	public void setSessionDomainName(String sessionDomainName) {
		this.sessionDomainName = sessionDomainName;
	}

	public String getSGSNAddressString() {
		return sGSNAddressString;
	}

	public void setSGSNAddressString(String addressString) {
		sGSNAddressString = addressString;
	}

	public String getSourceNetworkCd() {
		return sourceNetworkCd;
	}

	public void setSourceNetworkCd(String sourceNetworkCd) {
		this.sourceNetworkCd = sourceNetworkCd;
	}

	public String getStatusRequestCd() {
		return statusRequestCd;
	}

	public void setStatusRequestCd(String statusRequestCd) {
		this.statusRequestCd = statusRequestCd;
	}

	public String getStatusResponseCd() {
		return statusResponseCd;
	}

	public void setStatusResponseCd(String statusResponseCd) {
		this.statusResponseCd = statusResponseCd;
	}

	public String getSubSidId() {
		return subSidId;
	}

	public void setSubSidId(String subSidId) {
		this.subSidId = subSidId;
	}

	public String getUserLoginText() {
		return userLoginText;
	}

	public void setUserLoginText(String userLoginText) {
		this.userLoginText = userLoginText;
	}

	public String getAccessPointNameNetworkString() {
		return accessPointNameNetworkString;
	}

	public void setAccessPointNameNetworkString(String accessPointNameNetworkString) {
		this.accessPointNameNetworkString = accessPointNameNetworkString;
	}

	public String getAccountingPlanName() {
		return accountingPlanName;
	}

	public void setAccountingPlanName(String accountingPlanName) {
		this.accountingPlanName = accountingPlanName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getCellSiteId() {
		return cellSiteId;
	}

	public void setCellSiteId(String cellSiteId) {
		this.cellSiteId = cellSiteId;
	}

	public String getChargingCharacterCd() {
		return chargingCharacterCd;
	}

	public void setChargingCharacterCd(String chargingCharacterCd) {
		this.chargingCharacterCd = chargingCharacterCd;
	}

	public String getChargingGatewayFunctionServiceId() {
		return chargingGatewayFunctionServiceId;
	}

	public void setChargingGatewayFunctionServiceId(
			String chargingGatewayFunctionServiceId) {
		this.chargingGatewayFunctionServiceId = chargingGatewayFunctionServiceId;
	}

	public String getChargingResultCd() {
		return chargingResultCd;
	}

	public void setChargingResultCd(String chargingResultCd) {
		this.chargingResultCd = chargingResultCd;
	}

	public String getContentURLString() {
		return contentURLString;
	}

	public void setContentURLString(String contentURLString) {
		this.contentURLString = contentURLString;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getFurnishChargingCd() {
		return furnishChargingCd;
	}

	public void setFurnishChargingCd(String furnishChargingCd) {
		this.furnishChargingCd = furnishChargingCd;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGGSNAddressString() {
		return gGSNAddressString;
	}

	public void setGGSNAddressString(String addressString) {
		gGSNAddressString = addressString;
	}

	public String getImeiNum() {
		return imeiNum;
	}

	public void setImeiNum(String imeiNum) {
		this.imeiNum = imeiNum;
	}

	public String getLocationAreaCd() {
		return locationAreaCd;
	}

	public void setLocationAreaCd(String locationAreaCd) {
		this.locationAreaCd = locationAreaCd;
	}

	public String getMocnMccMncCd() {
		return mocnMccMncCd;
	}

	public void setMocnMccMncCd(String mocnMccMncCd) {
		this.mocnMccMncCd = mocnMccMncCd;
	}

	public String getMultiplexId() {
		return multiplexId;
	}

	public void setMultiplexId(String multiplexId) {
		this.multiplexId = multiplexId;
	}

	public String getOtherPartyPhoneNum() {
		return otherPartyPhoneNum;
	}

	public void setOtherPartyPhoneNum(String otherPartyPhoneNum) {
		this.otherPartyPhoneNum = otherPartyPhoneNum;
	}

	public Date getRecordClosingTime() {
		return recordClosingTime;
	}

	public void setRecordClosingTime(Date recordClosingTime) {
		this.recordClosingTime = recordClosingTime;
	}

	public Double getRecordSequenceNum() {
		return recordSequenceNum;
	}

	public void setRecordSequenceNum(Double recordSequenceNum) {
		this.recordSequenceNum = recordSequenceNum;
	}

	public String getRecordStatusCd() {
		return recordStatusCd;
	}

	public void setRecordStatusCd(String recordStatusCd) {
		this.recordStatusCd = recordStatusCd;
	}

	public String getServiceAreaCd() {
		return serviceAreaCd;
	}

	public void setServiceAreaCd(String serviceAreaCd) {
		this.serviceAreaCd = serviceAreaCd;
	}

	public String getTerminationReasonCd() {
		return terminationReasonCd;
	}

	public void setTerminationReasonCd(String terminationReasonCd) {
		this.terminationReasonCd = terminationReasonCd;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public RawDataUsageDetailVO getRawDataUsageDetail() {
		return rawDataUsageDetail;
	}

	public void setRawDataUsageDetail(RawDataUsageDetailVO rawDataUsageDetail) {
		this.rawDataUsageDetail = rawDataUsageDetail;
	}
	
		
	public String getNetworkTypeCd() {
		return networkTypeCd;
	}

	public void setNetworkTypeCd(String networkTypeCd) {
		this.networkTypeCd = networkTypeCd;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("chargingId: ");buffer.append(chargingId);
		buffer.append(", contentDeliveredInd: ");buffer.append(contentDeliveredInd);
		buffer.append(", contentDownloadByteQuantity: ");buffer.append(contentDownloadByteQuantity);
		buffer.append(", deviceDownloadGBQuantity: ");buffer.append(deviceDownloadGBQuantity);
		buffer.append(", contentSizeQuantity: ");buffer.append(contentSizeQuantity);
		buffer.append(", contentUploadByteQuantity: ");buffer.append(contentUploadByteQuantity);
		buffer.append(", deviceUploadGBQuantity: ");buffer.append(deviceUploadGBQuantity);
		buffer.append(", dataServiceEventId: ");buffer.append(dataServiceEventId);
		buffer.append(", dataServiceEventId: ");buffer.append(dataServiceEventTime);
		buffer.append(", dataServiceEventTypeCd: ");buffer.append(dataServiceEventTypeCd);
		buffer.append(", deviceDownloadByteQuantity: ");buffer.append(deviceDownloadByteQuantity);
		buffer.append(", deviceUploadByteQuantity: ");buffer.append(deviceUploadByteQuantity);
		buffer.append(", phoneNumber: ");buffer.append(phoneNumber);////NPA + NXX + Line Number eventInitiatorPhoneNum : TelephoneNumberType
		buffer.append(", hostDomainName: ");buffer.append(hostDomainName);
		buffer.append(", imsiNum: ");buffer.append(imsiNum);
		buffer.append(", mccMncCd: ");buffer.append(mccMncCd);
		buffer.append(", mediationTransactionId: ");buffer.append(mediationTransactionId);
		buffer.append(", minNum: ");buffer.append(minNum);
		buffer.append(", nasIpString: ");buffer.append(nasIpString);
		buffer.append(", networkFileId: ");buffer.append(networkFileId);
		buffer.append(", recordCorrelationId: ");buffer.append(recordCorrelationId);
		buffer.append(", recordDuplicateCheckNum: ");buffer.append(recordDuplicateCheckNum);
		buffer.append(", recordId: ");buffer.append(recordId);
		buffer.append(", recordTypeCd: ");buffer.append(recordTypeCd);
		buffer.append(", requestedURLString: ");buffer.append(requestedURLString);
		buffer.append(", serviceBidId: ");buffer.append(serviceBidId);
		buffer.append(", serviceDurationSecQuantity: ");buffer.append(serviceDurationSecQuantity);
		buffer.append(", serviceTechnolgyCd: ");buffer.append(serviceTechnolgyCd);
		buffer.append(", servingNetworkString: ");buffer.append(servingNetworkString);
		buffer.append(", servingSidId: ");buffer.append(servingSidId);
		buffer.append(", sessionDomainName: ");buffer.append(sessionDomainName);
		buffer.append(", sGSNAddressString: ");buffer.append(sGSNAddressString);
		buffer.append(", sourceNetworkCd: ");buffer.append(sourceNetworkCd);
		buffer.append(", statusRequestCd: ");buffer.append(statusRequestCd);
		buffer.append(", statusResponseCd: ");buffer.append(statusResponseCd);
		buffer.append(", subSidId: ");buffer.append(subSidId);
		buffer.append(", userLoginText: ");buffer.append(userLoginText);				
		buffer.append(", accessPointNameNetworkString: ");buffer.append(accessPointNameNetworkString);
		buffer.append(", accountingPlanName: ");buffer.append(accountingPlanName);
		buffer.append(", artistName: ");buffer.append(artistName);	
		buffer.append(", cellSiteId: ");buffer.append(cellSiteId);
		buffer.append(", chargingCharacterCd: ");buffer.append(chargingCharacterCd);
		buffer.append(", chargingGatewayFunctionServiceId: ");buffer.append(chargingGatewayFunctionServiceId);
		buffer.append(", chargingResultCd: ");buffer.append(chargingResultCd);
		buffer.append(", contentURLString: ");buffer.append(contentURLString);
		buffer.append(", createUserId: ");buffer.append(createUserId);
		buffer.append(", furnishChargingCd: ");buffer.append(furnishChargingCd);
		buffer.append(", genre: ");buffer.append(genre);
		buffer.append(", gGSNAddressString: ");buffer.append(gGSNAddressString);
		buffer.append(", imeiNum: ");buffer.append(imeiNum);
		buffer.append(", locationAreaCd: ");buffer.append(locationAreaCd);
		buffer.append(", mocnMccMncCd: ");buffer.append(mocnMccMncCd);
		buffer.append(", multiplexId: ");buffer.append(multiplexId);
		buffer.append(", otherPartyPhoneNum: ");buffer.append(otherPartyPhoneNum);
		buffer.append(", recordClosingTime: ");buffer.append(recordClosingTime);
		buffer.append(", recordSequenceNum: ");buffer.append(recordSequenceNum);
		buffer.append(", recordStatusCd: ");buffer.append(recordStatusCd);
		buffer.append(", serviceAreaCd: ");buffer.append(serviceAreaCd);
		buffer.append(", terminationReasonCd: ");buffer.append(terminationReasonCd);
		buffer.append(", titleName: ");buffer.append(titleName);			
		
		return buffer.toString();
	}
	
}
