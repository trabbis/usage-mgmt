package com.telus.usage.mgmt.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.telus.usage.mgmt.beans.DataServiceEventVO;
import com.telus.usage.mgmt.beans.MobileInternetDataUsageVO;
import com.telus.usage.mgmt.beans.RawDataUsageDetailVO;
import com.telus.usage.mgmt.beans.RawUsageListResponseVO;

public class RawUsageListRowMapper implements RowMapper<DataServiceEventVO> {

	private Boolean detail = false;
	
	
	public Boolean getDetail() {
		return detail;
	}
	public void setDetail(Boolean detail) {
		this.detail = detail;
	}
	public RawUsageListRowMapper() {
	}
	public RawUsageListRowMapper(Boolean detail) {
		this.detail = detail;
	}
	
	@Override
	public DataServiceEventVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		DataServiceEventVO result = new DataServiceEventVO();

		result.setChargingId(rs.getString("CHARGING_ID"));   
		result.setContentDeliveredInd(rs.getString("CONTENT_DELIVERED_IND"));
		result.setContentDownloadByteQuantity(rs.getDouble("CONTENT_DOWNLOAD_BYTE_QTY"));
		result.setDeviceDownloadGBQuantity(rs.getDouble("DEVICE_DOWNLOAD_GB_QTY"));
		result.setContentSizeQuantity(rs.getDouble("CONTENT_SIZE_QTY"));
		result.setContentUploadByteQuantity(rs.getDouble(  "CONTENT_UPLOAD_BYTE_QTY"));
		result.setDeviceUploadGBQuantity(rs.getDouble("DEVICE_UPLOAD_GB_QTY"));
		result.setDataServiceEventId(rs.getLong("DATA_SRVC_EVENT_ID"));
		result.setDataServiceEventTime(rs.getDate("DATA_SRVC_EVENT_TS"));
		result.setDataServiceEventTypeCd(rs.getString("DATA_SRVC_EVENT_TYPE_CD"));    		
		result.setDeviceDownloadByteQuantity(rs.getDouble("DEVICE_DOWNLOAD_BYTE_QTY"));
		result.setDeviceUploadByteQuantity(rs.getDouble("DEVICE_UPLOAD_BYTE_QTY"));
		result.setHostDomainName(rs.getString("HOST_DOMAIN_NM"));
		result.setImsiNum(rs.getString("IMSI_NUM"));
		result.setMccMncCd(rs.getString("MCC_MNC_CD"));
		result.setMediationTransactionId(rs.getLong("MED_TXN_ID"));
		result.setMinNum(rs.getString("MIN_NUM"));
		result.setNasIpString(rs.getString("NAS_IP_STR"));
		result.setNetworkFileId(rs.getLong("NETWORK_FILE_ID"));
		result.setPhoneNumber(rs.getString("EVENT_BILLABLE_PHONE_NUM"));    		
		result.setRecordDuplicateCheckNum(rs.getDouble("RECORD_DUPLICATE_CHECK_NUM"));
		
		result.setRecordId(rs.getString("RECORD_ID"));
		
		result.setRecordTypeCd(rs.getString("RECORD_TYPE_CD"));
		result.setRequestedURLString(rs.getString("REQUESTED_URL_STR"));
		result.setServiceBidId(rs.getString("SERVING_BID_ID"));
		result.setServiceDurationSecQuantity(rs.getDouble("SRVC_DURATION_SEC_QTY"));
		result.setServiceTechnolgyCd(rs.getString("SRVC_TECHNOLOGY_CD"));
		result.setServingNetworkString(rs.getString("SERVING_NETWORK_STR"));
		result.setServingSidId(rs.getString("SERVING_SID_ID"));
		result.setSessionDomainName(rs.getString("SESSION_DOMAIN_NM"));
		result.setSGSNAddressString(rs.getString("SGSN_ADDRESS_STR"));
		result.setSourceNetworkCd(rs.getString("SOURCE_NETWORK_CD"));
		result.setStatusRequestCd(rs.getString("STATUS_REQUEST_CD"));
		result.setStatusResponseCd(rs.getString("STATUS_RESPONSE_CD"));
		result.setSubSidId(rs.getString("SUB_SID_ID"));
		result.setUserLoginText(rs.getString("USER_LOGIN_TXT"));
			
		
		result.setAccessPointNameNetworkString(rs.getString("APN_NETWORK_STR"));
		result.setAccountingPlanName(rs.getString("ACCOUNTING_PLAN_NM"));
		result.setArtistName(rs.getString("ARTIST_NM"));
		result.setCellSiteId(rs.getString("CELL_SITE_ID"));
		result.setChargingCharacterCd(rs.getString("CHARGING_CHARAC_CD"));
		result.setChargingGatewayFunctionServiceId(rs.getString("CGF_SERVICE_ID"));

		result.setContentURLString(rs.getString("CONTENT_URL_STR"));

		result.setGenre(rs.getString("GENRE_NM"));
		result.setGGSNAddressString(rs.getString("GGSN_ADDRESS_STR"));
		result.setImeiNum(rs.getString("IMEI_NUM"));
		result.setLocationAreaCd(rs.getString("LOCATION_AREA_CD"));
		result.setMocnMccMncCd(rs.getString("MOCN_MCC_MNC_CD"));
		result.setMultiplexId(rs.getString("MULTIPLEX_ID"));
		result.setRecordClosingTime(rs.getDate("RECORD_CLOSING_TS"));
		result.setRecordSequenceNum(rs.getString("RECORD_SEQ_NUM"));
		result.setServiceAreaCd(rs.getString("SERVICE_AREA_CD"));
		result.setTerminationReasonCd(rs.getString("TERMINATION_REASON_CD"));
		result.setTitleName(rs.getString("TITLE_NM"));
		
		result.setCreateTime(rs.getDate("CREATE_TS"));
		
		result.setChargingResultCd(rs.getString("CHARGING_RESULT_CD"));    		
		result.setFurnishChargingCd(rs.getString("FURNISH_CHARGING_CD"));
		
		result.setRadioAccessTechTypeCd(rs.getString("RADIO_ACCESS_TECH_TYPE_CD"));
			    
		result.setServedPacketDataProtocolAddressTxt(rs.getString("SERVED_PDP_ADDRESS_STR"));
		result.setNetworkTypeCd(rs.getString("NETWORK_TYPE_CD"));

		
		if (getDetail()) {
			RawDataUsageDetailVO rdud = result.getRawDataUsageDetail();    		        		
			MobileInternetDataUsageVO midu = rdud.getMobileInternetDataUsage();
			
			midu.setAccessPointNameOperatorString(rs.getString("APN_OPERATOR_STR"));
			midu.setAccessTypeCd(rs.getString("ACCESS_TYPE_CD"));
			midu.setCdrStoredCd(rs.getString("CDR_STORED_CD"));
			midu.setCdrTotalQuatity(rs.getString("CDR_TOTAL_QTY"));
			midu.setCdrTotalVolumeQuatity(rs.getString("CDR_TOTAL_VOLUME_QTY"));
			midu.setChargingCharacterSelectionModeCd(rs.getString("CHARGING_CHARAC_SEL_MODE_CD"));
			midu.setChargingClassCd(rs.getString("CHARGING_CLASS_CD"));
			midu.setChargingProfileCd(rs.getString("CHARGING_PROFILE_CD"));
			midu.setChargingTypeCd(rs.getString("CHARGING_TYPE_CD"));
			midu.setChargingTypeSelectionModeCd(rs.getString("CHARGING_TYPE_SEL_MODE_CD"));
			midu.setClosingTimezoneSecondQuantity(rs.getString("CLOSING_TIMEZONE_SECOND_QTY"));
			midu.setDiagnostics1Cd(rs.getString("DIAGNOSTICS_1_CD"));
			midu.setDiagnostics2Cd(rs.getString("DIAGNOSTICS_2_CD"));
			midu.setDiagnostics3Cd(rs.getString("DIAGNOSTICS_3_CD"));
			midu.setDiagnostics4Cd(rs.getString("DIAGNOSTICS_4_CD"));
			midu.setDiagnostics5Cd(rs.getString("DIAGNOSTICS_5_CD"));
			midu.setDownlinkHitQuantity(rs.getString("DOWNLINK_HIT_QTY"));
			midu.setDynamicAddressFlagCd(rs.getString("DYNAMIC_ADDRESS_FLAG_CD"));
//			midu.setFirstSequenceNum(getDouble(set, "FIRST_SEQUENCE_NUM"));
			midu.setIpTechnologyCd(rs.getString("IP_TECHNOLOGY_CD"));
//			midu.setLastSequenceNum(getDouble(set, "LAST_SEQUENCE_NUM"));
			midu.setMobileStationNetworkCapabilityCd(rs.getString("MS_NW_CAPABILITY_CD"));
			midu.setNapiMsisdnCd(rs.getString("NAPI_MSISDN_CD"));
			midu.setNetworkInitPacketDataProtocolContextInd(rs.getString("NETWORK_INIT_PDP_CONTEXT_IND"));
			
			midu.setNodeId(rs.getString("NODE_ID"));
			
//			midu.setOpeningTimezoneSecondQuantity(getDouble(set, "OPENING_TIMEZONE_SECOND_QTY"));
			midu.setPacketDataProtocolHlrIndexCd(rs.getString("PDP_HLR_INDEX_CD"));
			midu.setPotentialDuplicateCd(rs.getString("POTENTIAL_DUPLICATE_CD"));
			midu.setQualityOfServiceNegotiatedString(rs.getString("QOS_NEGOTIATED_STR"));
			midu.setQualityOfServiceRequestedString(rs.getString("QOS_REQUESTED_STR"));

			midu.setRecordCorrelationId(rs.getString("RECORD_CORRELATION_ID"));
			
			midu.setRecordId(rs.getString("RECORD_ID"));
			
			midu.setRecordVersionCd(rs.getString("RECORD_VERSION_CD"));
			midu.setRoutingAreaCd(rs.getString("ROUTING_AREA_CD"));
			midu.setServedPacketDataProtocolAddressExtString(rs.getString("SERVED_PDP_ADDR_EXT_STR"));
			midu.setServedPacketDataProtocolAddressString(rs.getString("SERVED_PDP_ADDRESS_STR"));
			midu.setServedPacketDataProtocolTypeOrgCd(rs.getString("SERVED_PDP_TYPE_ORG_CD"));
			midu.setServedPacketDataProtocolTypeValueCd(rs.getString("SERVED_PDP_TYPE_VALUE_CD"));
			midu.setServerId(rs.getString("SERVER_ID"));        		
			midu.setSessionActionCd(rs.getString("SESSION_ACTION_CD"));
			midu.setSessionId(rs.getString("SESSION_ID"));
			midu.setSgsnChangeCd(rs.getString("SGSN_CHANGE_CD"));
			midu.setSourceDeviceIpString(rs.getString("SOURCE_DEVICE_IP_STR"));
			midu.setSystemTypeCd(rs.getString("SYSTEM_TYPE_CD"));
//			midu.setUplinkHitQuantity(getLong(set, "UPLINK_HIT_QTY"));
			midu.setValidationCd(rs.getString("VALIDATION_CD"));
			midu.setWalletChargingTypeCd(rs.getString("WALLET_CHARGING_TYPE_CD"));
			midu.setWalletId(rs.getString("WALLET_ID"));    		
			
		}
		
		
		
		return result;
	}

}
