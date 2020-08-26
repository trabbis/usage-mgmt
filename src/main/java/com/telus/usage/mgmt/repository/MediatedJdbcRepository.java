package com.telus.usage.mgmt.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.telus.usage.mgmt.beans.DataServiceEventVO;
import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.beans.TeamMember;

@Repository
public class MediatedJdbcRepository implements IJdbcRepository {
	
	@Autowired
	@Qualifier("m1JdbcTemplate")
	private NamedParameterJdbcTemplate jdbcTemplate;
	
    private List<TeamMember> findByNameAndPrice(String name) {

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
//        mapSqlParameterSource.addValue("id", name);
        
        return jdbcTemplate.query(
        		  "select * from rated_data_srvc_event where rownum <= 100",
                mapSqlParameterSource,
                (rs, rowNum) ->
                        new TeamMember(
                                rs.getString("PRICE_PLAN_SRVC_PACKAGE_CD"),
                                rs.getString("SRVC_PACKAGE_CD")
                        )
        );
    }

	@Override
	public String getRepositoryCode() {
		return "MEDIATED";
	}

	@Override
	public RawUsageListResponseVO getRawUsageList(SearchRawUsageListVO searchRulVO) {
        
		findByNameAndPrice(null);
		
		RawUsageListResponseVO rawUsage = new RawUsageListResponseVO(null);
		
		List<DataServiceEventVO> dataService = new ArrayList<DataServiceEventVO>();
		DataServiceEventVO dataServiceEventVO = new DataServiceEventVO();
		dataServiceEventVO.setAccountingPlanName("accountingPlanName");
		dataService.add(dataServiceEventVO);
		
        rawUsage.setRawUsageList(dataService);
        
		return rawUsage;
	}


}
