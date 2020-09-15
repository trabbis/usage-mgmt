package com.telus.usage.mgmt.beans;



public class MobileInternetDataUsageVO extends ValueObject {
	
	private String ipTechnologyCd;
	private String serverId;
	private String sessionActionCd;
	private String chargingProfileCd;
	private String diagnostics1Cd;
	private String diagnostics2Cd;
	private String diagnostics3Cd;
	private String diagnostics4Cd;
	private String diagnostics5Cd;
	private String chargingTypeCd;
	private String servedPacketDataProtocolTypeOrgCd;
	private String servedPacketDataProtocolTypeValueCd;
	private String servedPacketDataProtocolAddressString;
	private String servedPacketDataProtocolAddressExtString;
	private String mobileStationNetworkCapabilityCd;
	private String recordVersionCd;
	
	private String potentialDuplicateCd;
	private String cdrTotalQuatity;
	private String cdrTotalVolumeQuatity;
	private String validationCd;
	private String napiMsisdnCd;
	private String accessPointNameOperatorString;
	private String routingAreaCd;
	private String sgsnChangeCd;
	private String accessTypeCd;
	private String dynamicAddressFlagCd;
	private String chargingCharacterSelectionModeCd;
	private String chargingTypeSelectionModeCd;
	private String chargingClassCd;
	private Long uplinkHitQuantity;
	private String downlinkHitQuantity;
	private Double openingTimezoneSecondQuantity;
	private String walletId;
	private String walletChargingTypeCd;
	private String closingTimezoneSecondQuantity;
	private Double firstSequenceNum;
	private Double lastSequenceNum;
	private String cdrStoredCd;
	private String qualityOfServiceRequestedString;
	private String qualityOfServiceNegotiatedString;
	private String recordCorrelationId;
	private String sessionId;
	private String nodeId;
	private String systemTypeCd;
	private String sourceDeviceIpString;
	private String packetDataProtocolHlrIndexCd;
	private String recordId;
	private String networkInitPacketDataProtocolContextInd;
	  
	public String getIpTechnologyCd() {
		return ipTechnologyCd;
	}
	public void setIpTechnologyCd(String ipTechnologyCd) {
		this.ipTechnologyCd = ipTechnologyCd;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getSessionActionCd() {
		return sessionActionCd;
	}
	public void setSessionActionCd(String sessionActionCd) {
		this.sessionActionCd = sessionActionCd;
	}
	public String getChargingProfileCd() {
		return chargingProfileCd;
	}
	public void setChargingProfileCd(String chargingProfileCd) {
		this.chargingProfileCd = chargingProfileCd;
	}
	public String getDiagnostics1Cd() {
		return diagnostics1Cd;
	}
	public void setDiagnostics1Cd(String diagnostics1Cd) {
		this.diagnostics1Cd = diagnostics1Cd;
	}
	public String getDiagnostics2Cd() {
		return diagnostics2Cd;
	}
	public void setDiagnostics2Cd(String diagnostics2Cd) {
		this.diagnostics2Cd = diagnostics2Cd;
	}
	public String getDiagnostics3Cd() {
		return diagnostics3Cd;
	}
	public void setDiagnostics3Cd(String diagnostics3Cd) {
		this.diagnostics3Cd = diagnostics3Cd;
	}
	public String getDiagnostics4Cd() {
		return diagnostics4Cd;
	}
	public void setDiagnostics4Cd(String diagnostics4Cd) {
		this.diagnostics4Cd = diagnostics4Cd;
	}
	public String getDiagnostics5Cd() {
		return diagnostics5Cd;
	}
	public void setDiagnostics5Cd(String diagnostics5Cd) {
		this.diagnostics5Cd = diagnostics5Cd;
	}
	public String getChargingTypeCd() {
		return chargingTypeCd;
	}
	public void setChargingTypeCd(String chargingTypeCd) {
		this.chargingTypeCd = chargingTypeCd;
	}
	public String getServedPacketDataProtocolTypeOrgCd() {
		return servedPacketDataProtocolTypeOrgCd;
	}
	public void setServedPacketDataProtocolTypeOrgCd(
			String servedPacketDataProtocolTypeOrgCd) {
		this.servedPacketDataProtocolTypeOrgCd = servedPacketDataProtocolTypeOrgCd;
	}
	public String getServedPacketDataProtocolTypeValueCd() {
		return servedPacketDataProtocolTypeValueCd;
	}
	public void setServedPacketDataProtocolTypeValueCd(
			String servedPacketDataProtocolTypeValueCd) {
		this.servedPacketDataProtocolTypeValueCd = servedPacketDataProtocolTypeValueCd;
	}
	public String getServedPacketDataProtocolAddressString() {
		return servedPacketDataProtocolAddressString;
	}
	public void setServedPacketDataProtocolAddressString(
			String servedPacketDataProtocolAddressString) {
		this.servedPacketDataProtocolAddressString = servedPacketDataProtocolAddressString;
	}
	public String getServedPacketDataProtocolAddressExtString()
    {
        return servedPacketDataProtocolAddressExtString;
    }
    public void setServedPacketDataProtocolAddressExtString(
            String servedPacketDataProtocolAddressExtString)
    {
        this.servedPacketDataProtocolAddressExtString = servedPacketDataProtocolAddressExtString;
    }
    public String getMobileStationNetworkCapabilityCd() {
		return mobileStationNetworkCapabilityCd;
	}
	public void setMobileStationNetworkCapabilityCd(
			String mobileStationNetworkCapabilityCd) {
		this.mobileStationNetworkCapabilityCd = mobileStationNetworkCapabilityCd;
	}
	public String getRecordVersionCd() {
		return recordVersionCd;
	}
	public void setRecordVersionCd(String recordVersionCd) {
		this.recordVersionCd = recordVersionCd;
	}
	public String getPotentialDuplicateCd() {
		return potentialDuplicateCd;
	}
	public void setPotentialDuplicateCd(String potentialDuplicateCd) {
		this.potentialDuplicateCd = potentialDuplicateCd;
	}
	public String getCdrTotalQuatity() {
		return cdrTotalQuatity;
	}
	public void setCdrTotalQuatity(String cdrTotalQuatity) {
		this.cdrTotalQuatity = cdrTotalQuatity;
	}
	public String getCdrTotalVolumeQuatity() {
		return cdrTotalVolumeQuatity;
	}
	public void setCdrTotalVolumeQuatity(String cdrTotalVolumeQuatity) {
		this.cdrTotalVolumeQuatity = cdrTotalVolumeQuatity;
	}
	public String getValidationCd() {
		return validationCd;
	}
	public void setValidationCd(String validationCd) {
		this.validationCd = validationCd;
	}
	public String getNapiMsisdnCd() {
		return napiMsisdnCd;
	}
	public void setNapiMsisdnCd(String napiMsisdnCd) {
		this.napiMsisdnCd = napiMsisdnCd;
	}
	public String getAccessPointNameOperatorString() {
		return accessPointNameOperatorString;
	}
	public void setAccessPointNameOperatorString(
			String accessPointNameOperatorString) {
		this.accessPointNameOperatorString = accessPointNameOperatorString;
	}
	public String getRoutingAreaCd() {
		return routingAreaCd;
	}
	public void setRoutingAreaCd(String routingAreaCd) {
		this.routingAreaCd = routingAreaCd;
	}
	public String getSgsnChangeCd() {
		return sgsnChangeCd;
	}
	public void setSgsnChangeCd(String sgsnChangeCd) {
		this.sgsnChangeCd = sgsnChangeCd;
	}
	public String getAccessTypeCd() {
		return accessTypeCd;
	}
	public void setAccessTypeCd(String accessTypeCd) {
		this.accessTypeCd = accessTypeCd;
	}
	public String getDynamicAddressFlagCd() {
		return dynamicAddressFlagCd;
	}
	public void setDynamicAddressFlagCd(String dynamicAddressFlagCd) {
		this.dynamicAddressFlagCd = dynamicAddressFlagCd;
	}
	public String getChargingCharacterSelectionModeCd() {
		return chargingCharacterSelectionModeCd;
	}
	public void setChargingCharacterSelectionModeCd(
			String chargingCharacterSelectionModeCd) {
		this.chargingCharacterSelectionModeCd = chargingCharacterSelectionModeCd;
	}
	public String getChargingTypeSelectionModeCd() {
		return chargingTypeSelectionModeCd;
	}
	public void setChargingTypeSelectionModeCd(String chargingTypeSelectionModeCd) {
		this.chargingTypeSelectionModeCd = chargingTypeSelectionModeCd;
	}
	public String getChargingClassCd() {
		return chargingClassCd;
	}
	public void setChargingClassCd(String chargingClassCd) {
		this.chargingClassCd = chargingClassCd;
	}
	public Long getUplinkHitQuantity() {
		return uplinkHitQuantity;
	}
	public void setUplinkHitQuantity(Long uplinkHitQuantity) {
		this.uplinkHitQuantity = uplinkHitQuantity;
	}
	public String getDownlinkHitQuantity() {
		return downlinkHitQuantity;
	}
	public void setDownlinkHitQuantity(String downlinkHitQuantity) {
		this.downlinkHitQuantity = downlinkHitQuantity;
	}
	public Double getOpeningTimezoneSecondQuantity() {
		return openingTimezoneSecondQuantity;
	}
	public void setOpeningTimezoneSecondQuantity(
			Double openingTimezoneSecondQuantity) {
		this.openingTimezoneSecondQuantity = openingTimezoneSecondQuantity;
	}
	public String getWalletId() {
		return walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	public String getWalletChargingTypeCd() {
		return walletChargingTypeCd;
	}
	public void setWalletChargingTypeCd(String walletChargingTypeCd) {
		this.walletChargingTypeCd = walletChargingTypeCd;
	}
	public String getClosingTimezoneSecondQuantity() {
		return closingTimezoneSecondQuantity;
	}
	public void setClosingTimezoneSecondQuantity(
			String closingTimezoneSecondQuantity) {
		this.closingTimezoneSecondQuantity = closingTimezoneSecondQuantity;
	}
	public Double getFirstSequenceNum() {
		return firstSequenceNum;
	}
	public void setFirstSequenceNum(Double firstSequenceNum) {
		this.firstSequenceNum = firstSequenceNum;
	}
	public Double getLastSequenceNum() {
		return lastSequenceNum;
	}
	public void setLastSequenceNum(Double lastSequenceNum) {
		this.lastSequenceNum = lastSequenceNum;
	}
	public String getCdrStoredCd() {
		return cdrStoredCd;
	}
	public void setCdrStoredCd(String cdrStoredCd) {
		this.cdrStoredCd = cdrStoredCd;
	}
	public String getQualityOfServiceRequestedString() {
		return qualityOfServiceRequestedString;
	}
	public void setQualityOfServiceRequestedString(
			String qualityOfServiceRequestedString) {
		this.qualityOfServiceRequestedString = qualityOfServiceRequestedString;
	}
	public String getQualityOfServiceNegotiatedString() {
		return qualityOfServiceNegotiatedString;
	}
	public void setQualityOfServiceNegotiatedString(
			String qualityOfServiceNegotiatedString) {
		this.qualityOfServiceNegotiatedString = qualityOfServiceNegotiatedString;
	}
	public String getRecordCorrelationId() {
		return recordCorrelationId;
	}
	public void setRecordCorrelationId(String recordCorrelationId) {
		this.recordCorrelationId = recordCorrelationId;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getSystemTypeCd() {
		return systemTypeCd;
	}
	public void setSystemTypeCd(String systemTypeCd) {
		this.systemTypeCd = systemTypeCd;
	}
	public String getSourceDeviceIpString() {
		return sourceDeviceIpString;
	}
	public void setSourceDeviceIpString(String sourceDeviceIpString) {
		this.sourceDeviceIpString = sourceDeviceIpString;
	}
	public String getPacketDataProtocolHlrIndexCd() {
		return packetDataProtocolHlrIndexCd;
	}
	public void setPacketDataProtocolHlrIndexCd(String packetDataProtocolHlrIndexCd) {
		this.packetDataProtocolHlrIndexCd = packetDataProtocolHlrIndexCd;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getNetworkInitPacketDataProtocolContextInd() {
		return networkInitPacketDataProtocolContextInd;
	}
	public void setNetworkInitPacketDataProtocolContextInd(
			String networkInitPacketDataProtocolContextInd) {
		this.networkInitPacketDataProtocolContextInd = networkInitPacketDataProtocolContextInd;
	}	
	  
}
