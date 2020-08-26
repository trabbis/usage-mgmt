package com.telus.usage.mgmt.repository;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DynamicAutowireRepository {
	
    private final Map<String, IJdbcRepository> repositories;
    
    @Autowired
    public DynamicAutowireRepository(List<IJdbcRepository> repositoryLists) {
        repositories = repositoryLists.stream()
                .collect(Collectors.toMap(IJdbcRepository::getRepositoryCode, Function.identity()));
    }
 
    public IJdbcRepository getRepository(String code) {
    	return repositories.get(code);
    	
    }

}
