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
	



}
