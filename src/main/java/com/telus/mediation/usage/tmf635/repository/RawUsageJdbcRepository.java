package com.telus.mediation.usage.tmf635.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.telus.mediation.usage.tmf635.model.DataServiceEventVO;
import com.telus.mediation.usage.tmf635.model.RawUsageDetailResponseVO;
import com.telus.mediation.usage.tmf635.model.RawUsageListResponseVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageDetailVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageListVO;

@Repository
public class RawUsageJdbcRepository implements IUsageManagement {
	
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	public static final String SELECT_CIPDR_RAW_USAGE_DETAIL=
			" select " +
			" 	dse.DATA_SRVC_EVENT_TS, dse.DATA_SRVC_EVENT_ID,MIN_NUM, dse.EVENT_BILLABLE_PHONE_NUM, dse.NETWORK_FILE_ID, " +
			"	dse.SRVC_DURATION_SEC_QTY, dse.SERVING_NETWORK_STR, dse.IMSI_NUM, dse.SERVING_SID_ID, dse.SERVING_BID_ID, " +
			"	dse.DEVICE_UPLOAD_BYTE_QTY, dse.DEVICE_DOWNLOAD_BYTE_QTY, dse.DEVICE_DOWNLOAD_GB_QTY, dse.DEVICE_UPLOAD_GB_QTY, " +
			"	dse.CONTENT_DOWNLOAD_BYTE_QTY, dse.CONTENT_UPLOAD_BYTE_QTY, dse.RECORD_TYPE_CD, dse.SRVC_TECHNOLOGY_CD, " +
			"	dse.USER_LOGIN_TXT, dse.NAS_IP_STR, dse.SUB_SID_ID, dse.SESSION_DOMAIN_NM, dse.SOURCE_NETWORK_CD, " +
			"	dse.DATA_SRVC_EVENT_TYPE_CD, dse.CHARGING_ID, dse.SGSN_ADDRESS_STR, dse.MED_TXN_ID, dse.TITLE_NM, dse.ARTIST_NM, " +
			"	dse.GENRE_NM, dse.CONTENT_SIZE_QTY, dse.CONTENT_DELIVERED_IND, dse.HOST_DOMAIN_NM, dse.ACCOUNTING_PLAN_NM, " +
			"	dse.RECORD_CLOSING_TS, dse.RECORD_DUPLICATE_CHECK_NUM, dse.REQUESTED_URL_STR, dse.STATUS_REQUEST_CD, " +
			"	dse.STATUS_RESPONSE_CD, dse.MCC_MNC_CD, dse.MOCN_MCC_MNC_CD, dse.GGSN_ADDRESS_STR, dse.IMEI_NUM, dse.APN_NETWORK_STR, " +
			"	dse.CGF_SERVICE_ID, dse.MULTIPLEX_ID, dse.LOCATION_AREA_CD, dse.SERVICE_AREA_CD, dse.CELL_SITE_ID, dse.CONTENT_URL_STR, " +
			"	dse.CHARGING_CHARAC_CD, dse.RECORD_SEQ_NUM, dse.TERMINATION_REASON_CD, dse.CREATE_TS, dse.CHARGING_RESULT_CD, dse.FURNISH_CHARGING_CD, " +
			"	dse.DATA_SRVC_EVENT_TS,dse.DATA_SRVC_EVENT_ID,dse.SERVER_ID,dse.SESSION_ACTION_CD,dse.IP_TECHNOLOGY_CD,dse.IP_SESSION_END_IND," +
			"	dse.RECORD_ID,dse.RECORD_CORRELATION_ID,dse.DIAGNOSTICS_1_CD,dse.DIAGNOSTICS_2_CD,dse.DIAGNOSTICS_3_CD,dse.DIAGNOSTICS_4_CD,dse.DIAGNOSTICS_5_CD," +
			"	dse.SERVED_PDP_TYPE_ORG_CD,dse.SERVED_PDP_TYPE_VALUE_CD,dse.SERVED_PDP_ADDRESS_STR,dse.SERVED_PDP_ADDR_EXT_STR, dse.NETWORK_TYPE_CD, dse.MS_NW_CAPABILITY_CD,dse.WALLET_ID, " +
			"	dse.RECORD_VERSION_CD,dse.RADIO_ACCESS_TECH_TYPE_CD,dse.POTENTIAL_DUPLICATE_CD,dse.CDR_TOTAL_QTY,dse.CDR_TOTAL_VOLUME_QTY,dse.VALIDATION_CD, " +
			"	dse.NAPI_MSISDN_CD,dse.APN_OPERATOR_STR,dse.ROUTING_AREA_CD,dse.SGSN_CHANGE_CD,dse.ACCESS_TYPE_CD,dse.DYNAMIC_ADDRESS_FLAG_CD, " +
			"	dse.CHARGING_CHARAC_SEL_MODE_CD,dse.CHARGING_TYPE_SEL_MODE_CD,dse.SYSTEM_TYPE_CD,dse.CHARGING_CLASS_CD," +
			"	dse.UPLINK_HIT_QTY,dse.DOWNLINK_HIT_QTY,dse.OPENING_TIMEZONE_SECOND_QTY,dse.CLOSING_TIMEZONE_SECOND_QTY,dse.FIRST_SEQUENCE_NUM," +
			"	dse.LAST_SEQUENCE_NUM,dse.NODE_ID,dse.CDR_STORED_CD,dse.SOURCE_DEVICE_IP_STR,dse.PDP_HLR_INDEX_CD,dse.NETWORK_INIT_PDP_CONTEXT_IND, " +
			"	dse.WALLET_CHARGING_TYPE_CD,dse.QOS_REQUESTED_STR,dse.QOS_NEGOTIATED_STR,dse.SESSION_ID,dse.CHARGING_PROFILE_CD, dse.CHARGING_TYPE_CD, dse.RADIO_ACCESS_TECH_TYPE_CD " +
			" from " +
			"	DATA_SRVC_EVENT  dse " +
			" where " +
//			"	dse.DATA_SRVC_EVENT_TS = to_date(?, 'YYYY-MM-DD HH24:MI:ss') and " +
			"	dse.DATA_SRVC_EVENT_ID = :id ";
	
	
	public static final String SELECT_CIPDR_RAW_USAGE=
			" select /*+ INDEX(DATA_SRVC_EVENT  I_DATA_SRVC_EVENT_01) */ " +
			" 	DATA_SRVC_EVENT_TS, DATA_SRVC_EVENT_ID,MIN_NUM, EVENT_BILLABLE_PHONE_NUM, NETWORK_FILE_ID, " +
			"	SRVC_DURATION_SEC_QTY, SERVING_NETWORK_STR, IMSI_NUM, SERVING_SID_ID, SERVING_BID_ID, " +
			"	DEVICE_UPLOAD_BYTE_QTY, DEVICE_DOWNLOAD_BYTE_QTY, DEVICE_DOWNLOAD_GB_QTY, DEVICE_UPLOAD_GB_QTY, " +
			"	CONTENT_DOWNLOAD_BYTE_QTY, CONTENT_UPLOAD_BYTE_QTY, RECORD_TYPE_CD, SRVC_TECHNOLOGY_CD, " +
			"	USER_LOGIN_TXT, NAS_IP_STR, SUB_SID_ID, SESSION_DOMAIN_NM, SOURCE_NETWORK_CD, " +
			"	DATA_SRVC_EVENT_TYPE_CD, CHARGING_ID, SGSN_ADDRESS_STR, MED_TXN_ID, TITLE_NM, ARTIST_NM, " +
			"	GENRE_NM, CONTENT_SIZE_QTY,CONTENT_DELIVERED_IND, HOST_DOMAIN_NM, ACCOUNTING_PLAN_NM, " +
			"	RECORD_CLOSING_TS, RECORD_DUPLICATE_CHECK_NUM, REQUESTED_URL_STR, STATUS_REQUEST_CD, " +
			"	STATUS_RESPONSE_CD, MCC_MNC_CD, MOCN_MCC_MNC_CD, GGSN_ADDRESS_STR, IMEI_NUM, APN_NETWORK_STR, " +
			"	CGF_SERVICE_ID, MULTIPLEX_ID, LOCATION_AREA_CD, SERVICE_AREA_CD, CELL_SITE_ID, CONTENT_URL_STR, " +
			"	CHARGING_CHARAC_CD,RECORD_SEQ_NUM, TERMINATION_REASON_CD, CREATE_TS, " +
			"	CHARGING_RESULT_CD, FURNISH_CHARGING_CD , RADIO_ACCESS_TECH_TYPE_CD, RECORD_ID ,SERVED_PDP_ADDRESS_STR, NETWORK_TYPE_CD" +
			" from " +
			"	data_srvc_event " +
			" where " +
			"	data_srvc_event_ts >= to_date(:fromDate, 'YYYY-MM-DD HH24:MI:SS') and " +
			"	data_srvc_event_ts <= to_date(:toDate, 'YYYY-MM-DD HH24:MI:SS') and " +
			"	(EVENT_BILLABLE_PHONE_NUM=:phoneNumber or EVENT_BILLABLE_PHONE_NUM=:phoneNumber) and " +
			"	UPPER(DATA_SRVC_EVENT_TYPE_CD)= :eventTypeCd ";
//			"	and rownum <= 101 "; //TODO remove later
//  OFFSET 10 ROWS 
//  FETCH NEXT 10 ROWS ONLY;
	

	@Override
    public RawUsageListResponseVO getRawUsageList(SearchRawUsageListVO searchRawUsageListVO) {

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("fromDate", searchRawUsageListVO.getSearchRawUsage().getFromDate());
        mapSqlParameterSource.addValue("toDate", searchRawUsageListVO.getSearchRawUsage().getToDate());
        mapSqlParameterSource.addValue("phoneNumber", searchRawUsageListVO.getSearchRawUsage().getPhoneNumber());
        mapSqlParameterSource.addValue("eventTypeCd", searchRawUsageListVO.getSearchRawUsage().getServiceType());
        
        StringBuffer sb = new StringBuffer(); 
        sb.append(SELECT_CIPDR_RAW_USAGE);
        
        if (searchRawUsageListVO.getBatchNumber() > 0) {
            sb.append("OFFSET ");
            sb.append(100 * searchRawUsageListVO.getBatchNumber());
            sb.append(" ROWS ");
        	
            sb.append(" FETCH NEXT ");
            sb.append(101);
            sb.append(" ROWS ONLY ");
        } else {
            sb.append(" FETCH NEXT 101 ROWS ONLY ");
        }
        
        List<DataServiceEventVO> dataService =  jdbcTemplate.query(
    			sb.toString(),
                mapSqlParameterSource,
                new RawUsageListRowMapper());
        
        RawUsageListResponseVO lists = new RawUsageListResponseVO(searchRawUsageListVO.getBatchNumber());
        if (dataService.size() > 100) {
            dataService.remove(100);
            lists.getBatchInfoTypeVO().setMoreDataExistInd(true);
        }
        lists.setRawUsageList(dataService);
        
        return lists;
        
        
    }

	@Override
	public String getRepositoryCode() {
		return "RAW";
	}

	@Override
	public RawUsageDetailResponseVO getRawUsageDetail(SearchRawUsageDetailVO searchRawUsageDetailVO) {
		
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("id", searchRawUsageDetailVO.getDataServiceEventId());
        
        StringBuffer sb = new StringBuffer(); 
        sb.append(SELECT_CIPDR_RAW_USAGE_DETAIL);
        
        DataServiceEventVO dataService =  jdbcTemplate.queryForObject(
    			sb.toString(),
                mapSqlParameterSource,
                new RawUsageListRowMapper(true));
        
        RawUsageDetailResponseVO detail = new RawUsageDetailResponseVO();
        detail.setRawUsageDetail(dataService);
        
        return detail;
        
	}



}
