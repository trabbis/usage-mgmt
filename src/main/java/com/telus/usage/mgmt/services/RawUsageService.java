package com.telus.usage.mgmt.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.beans.SearchRawUsageVO;
import com.telus.usage.mgmt.exceptions.ValidationException;
import com.telus.usage.mgmt.repository.RepositoryLookUpService;
import com.telus.usage.mgmt.repository.IUsageManagement;
import com.telus.usage.mgmt.response.RawUsageListResponse;
import com.telus.usage.mgmt.util.Constants;
import com.telus.usage.mgmt.util.Convertor;
import com.telus.usage.mgmt.util.RepoIndicatorUtil;

@Service
public class RawUsageService {
	
	@Autowired
	private RepositoryLookUpService dynamicAutowireRepository;
	
	public RawUsageListResponse getRawUsageList(SearchRawUsageListVO searchRawUsageListVO) throws ValidationException {
		
		SearchRawUsageVO searchRawUsageVO = searchRawUsageListVO.getSearchRawUsage();
		String repoIndictor = RepoIndicatorUtil.getRepoIndicator(Constants.STATE_RAW, searchRawUsageVO.getServiceType());
		
		IUsageManagement jdbcRepository = dynamicAutowireRepository.getRepository(repoIndictor);
		RawUsageListResponseVO lists = jdbcRepository.getRawUsageList(searchRawUsageListVO);

		return Convertor.convert(lists);
		
	}

	//Just for testing multiple dbs
	public RawUsageListResponseVO getRemediatedUsageList() throws Exception {
		
		String repoIndictor = RepoIndicatorUtil.getRepoIndicator(Constants.STATE_MEDIATED, "SERVICETYPE");
		
		IUsageManagement jdbcRepository = dynamicAutowireRepository.getRepository(repoIndictor);
		
		RawUsageListResponseVO lists = jdbcRepository.getRawUsageList(null);

		return lists;
	}


}
