package com.telus.bill.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
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
//			"	data_srvc_event_ts >= to_date(?, 'YYYY-MM-DD HH24:MI:SS') and " +
//			"	data_srvc_event_ts <= to_date(?, 'YYYY-MM-DD HH24:MI:SS') and " +
//			"	(EVENT_BILLABLE_PHONE_NUM=? or EVENT_BILLABLE_PHONE_NUM=?) and " +
			"	UPPER(DATA_SRVC_EVENT_TYPE_CD)= :eventTypeCd " +
			"	and rownum <= 100 "; //TODO remove later

	
    public List<TeamMember> findByNameAndPrice(String name) {

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("id", name);
//        mapSqlParameterSource.addValue("price", price);

//        select *  from team_member where TEAM_MEMBER_ID = :id
        
        return namedParameterJdbcTemplate.query(
//                "select * from books where name like :name and price <= :price",
        		  "select * from team_member where TEAM_MEMBER_ID = :id",
                mapSqlParameterSource,
                (rs, rowNum) ->
                        new TeamMember(
                                rs.getString("team_member_id"),
                                rs.getString("family_name")
                        )
        );
    }
	

    public RawUsageListResponseVO getRawUsageList(String name) {

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("eventTypeCd", name);
        
        List<DataServiceEventVO> dataService =  namedParameterJdbcTemplate.query(
    			SELECT_CIPDR_RAW_USAGE,
                mapSqlParameterSource,
                new RawUsageRowMapper());
        
        RawUsageListResponseVO rawUsage = new RawUsageListResponseVO(null);
        rawUsage.setRawUsageList(dataService);
        
        return rawUsage;
        
        
    }
	


}
