package com.telus.usage.mgmt.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.telus.usage.mgmt.beans.DataServiceEventVO;
import com.telus.usage.mgmt.beans.RawUsageListResponseVO;

public class RawUsageListRowMapper implements RowMapper<DataServiceEventVO> {

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

		
		
		return result;
	}

}
