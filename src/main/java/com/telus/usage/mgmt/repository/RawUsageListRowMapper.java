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
		
		DataServiceEventVO dataService = new DataServiceEventVO();
		dataService.setPhoneNumber(rs.getString("EVENT_BILLABLE_PHONE_NUM"));    		
		
		return dataService;
	}

}
