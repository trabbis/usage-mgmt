package com.telus.usage.mgmt.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.beans.SearchRawUsageVO;
import com.telus.usage.mgmt.repository.DynamicAutowireRepository;
import com.telus.usage.mgmt.repository.IJdbcRepository;
import com.telus.usage.mgmt.response.RawUsageListResponse;
import com.telus.usage.mgmt.util.Constants;
import com.telus.usage.mgmt.util.Convertor;
import com.telus.usage.mgmt.util.RepoIndicatorUtil;

@Service
public class RawUsageService {
	
	@Autowired
	private DynamicAutowireRepository dynamicAutowireRepository;
	
	public RawUsageListResponse getRawUsageList(SearchRawUsageListVO searchRawUsageListVO) throws Exception {
		
		SearchRawUsageVO searchRawUsageVO = searchRawUsageListVO.getSearchRawUsage();
		String repoIndictor = RepoIndicatorUtil.getRepoIndicator(Constants.STATE_RAW, searchRawUsageVO.getServiceType());
		
		IJdbcRepository jdbcRepository = dynamicAutowireRepository.getRepository(repoIndictor);
		RawUsageListResponseVO lists = jdbcRepository.getRawUsageList(searchRawUsageListVO);

		return Convertor.convert(lists);
		
	}

	//Just for testing multiple dbs
	public RawUsageListResponseVO getRemediatedUsageList() throws Exception {
		
		String repoIndictor = RepoIndicatorUtil.getRepoIndicator(Constants.STATE_MEDIATED, "SERVICETYPE");
		
		IJdbcRepository jdbcRepository = dynamicAutowireRepository.getRepository(repoIndictor);
		
		RawUsageListResponseVO lists = jdbcRepository.getRawUsageList(null);

		return lists;
	}


}
