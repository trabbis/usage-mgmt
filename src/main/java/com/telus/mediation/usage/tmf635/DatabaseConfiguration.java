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
	DataSource primaryDataSource() {
	    return DataSourceBuilder.create().build();
	}
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource-m1")
	DataSource m1DataSource() {
	    return DataSourceBuilder.create().build();
	}
	@Bean
	NamedParameterJdbcTemplate primaryJdbcTemplate() {
	    return new NamedParameterJdbcTemplate(primaryDataSource());
	}
	@Bean
	NamedParameterJdbcTemplate m1JdbcTemplate() {
	    return new NamedParameterJdbcTemplate(m1DataSource());
	}
	

}
