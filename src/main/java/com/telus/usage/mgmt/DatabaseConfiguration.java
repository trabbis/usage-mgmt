package com.telus.usage.mgmt;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class DatabaseConfiguration {
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	DataSource dataSourceOne() {
	    return DataSourceBuilder.create().build();
	}
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource2")
	DataSource dataSourceTwo() {
	    return DataSourceBuilder.create().build();
	}
	@Bean
	NamedParameterJdbcTemplate namedParameterJdbcTemplateOne() {
	    return new NamedParameterJdbcTemplate(dataSourceOne());
	}
	@Bean
	NamedParameterJdbcTemplate namedParameterJdbcTemplateTwo() {
	    return new NamedParameterJdbcTemplate(dataSourceTwo());
	}
	

}
