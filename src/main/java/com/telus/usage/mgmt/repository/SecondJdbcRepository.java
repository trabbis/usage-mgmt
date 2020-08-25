package com.telus.usage.mgmt.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.telus.usage.mgmt.beans.TeamMember;

@Repository
public class SecondJdbcRepository {
	
	@Autowired
	@Qualifier("m1JdbcTemplate")
	private NamedParameterJdbcTemplate jdbcTemplate;
	
    public List<TeamMember> findByNameAndPrice(String name) {

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


}
