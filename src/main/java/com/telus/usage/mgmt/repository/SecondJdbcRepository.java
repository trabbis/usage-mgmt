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
	@Qualifier("namedParameterJdbcTemplateTwo")
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
    public List<TeamMember> findByNameAndPrice(String name) {

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("id", name);
        
        return namedParameterJdbcTemplate.query(
        		  "select * from team_member where TEAM_MEMBER_ID = :id",
                mapSqlParameterSource,
                (rs, rowNum) ->
                        new TeamMember(
                                rs.getString("team_member_id"),
                                rs.getString("family_name")
                        )
        );
    }


}
