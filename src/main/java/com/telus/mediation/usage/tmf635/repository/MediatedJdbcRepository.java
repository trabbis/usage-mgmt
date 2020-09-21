package com.telus.mediation.usage.tmf635.repository;

import java.util.ArrayList;
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
import com.telus.mediation.usage.tmf635.model.TestModel;

@Repository
public class MediatedJdbcRepository implements IUsageManagement {
	
	@Autowired
	@Qualifier("m1JdbcTemplate")
	private NamedParameterJdbcTemplate jdbcTemplate;
	
    private List<TestModel> findByNameAndPrice(String name) {

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
//        mapSqlParameterSource.addValue("id", name);
        
        return jdbcTemplate.query(
        		  "select * from rated_data_srvc_event where rownum <= 100",
                mapSqlParameterSource,
                (rs, rowNum) ->
                        new TestModel(
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

	@Override
	public RawUsageDetailResponseVO getRawUsageDetail(SearchRawUsageDetailVO searchRudVO) {
		// TODO Auto-generated method stub
		return null;
	}


}
