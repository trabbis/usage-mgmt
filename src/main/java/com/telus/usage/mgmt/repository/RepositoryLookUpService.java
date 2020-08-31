package com.telus.usage.mgmt.repository;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositoryLookUpService {
	
    private final Map<String, IUsageManagement> repositories;
    
    @Autowired
    public RepositoryLookUpService(List<IUsageManagement> repositoryLists) {
        repositories = repositoryLists.stream()
                .collect(Collectors.toMap(IUsageManagement::getRepositoryCode, Function.identity()));
    }
 
    public IUsageManagement getRepository(String code) {
    	return repositories.get(code);
    	
    }

}
