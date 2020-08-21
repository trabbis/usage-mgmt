package com.telus.bill.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class RawUsageRowMapper implements RowMapper<DataServiceEventVO> {

	@Override
	public DataServiceEventVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		RawUsageListResponseVO rawUsage = new RawUsageListResponseVO(null);
		
		DataServiceEventVO dataService = new DataServiceEventVO();
		
		dataService.setPhoneNumber(rs.getString("EVENT_BILLABLE_PHONE_NUM"));    		
		
		return dataService;
	}

}
