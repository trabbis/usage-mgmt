package com.telus.usage.mgmt.services;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telus.usage.mgmt.beans.DataServiceEventVO;
import com.telus.usage.mgmt.beans.RawUsageDetailResponseVO;
import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageDetailVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.beans.SearchRawUsageVO;
import com.telus.usage.mgmt.exceptions.ValidationException;
import com.telus.usage.mgmt.repository.RepositoryLookUpService;
import com.telus.usage.mgmt.repository.IUsageManagement;
import com.telus.usage.mgmt.response.RawUsageListResponse;
import com.telus.usage.mgmt.response.Usage;
import com.telus.usage.mgmt.util.Constants;
import com.telus.usage.mgmt.util.Convertor;
import com.telus.usage.mgmt.util.RepoIndicatorUtil;

@Service
public class RawUsageService {
	
	@Autowired
	private RepositoryLookUpService repoLookUpService;
	
	public List<Usage> getRawUsageList(SearchRawUsageListVO searchRawUsageListVO) throws ValidationException {
		
		SearchRawUsageVO searchRawUsageVO = searchRawUsageListVO.getSearchRawUsage();
		String repoIndictor = RepoIndicatorUtil.getRepoIndicator(Constants.STATE_RAW, searchRawUsageVO.getServiceType());
		
		IUsageManagement usageMgmt = repoLookUpService.getRepository(repoIndictor);
		RawUsageListResponseVO lists = usageMgmt.getRawUsageList(searchRawUsageListVO);

		List<Usage> usageList = Convertor.convertTmf635(lists);
		
		//Convertor.convert(lists);
		return usageList; 
		
	}
	
	public List<Usage> getRawUsageDetail(SearchRawUsageDetailVO searchRawUsageDetailVO) throws ValidationException {
		
//		SearchRawUsageVO searchRawUsageVO = searchRawUsageListVO.getSearchRawUsage();
		String repoIndictor = RepoIndicatorUtil.getRepoIndicator(Constants.STATE_RAW, "WISP");
		
		IUsageManagement usageMgmt = repoLookUpService.getRepository(repoIndictor);
		RawUsageDetailResponseVO lists = usageMgmt.getRawUsageDetail(searchRawUsageDetailVO);

//		List<Usage> usageList = Convertor.convertTmf635(lists);
		
		//Convertor.convert(lists);
		return null; 
		
	}
	

	//Just for testing multiple dbs
	public RawUsageListResponseVO getRemediatedUsageList() throws Exception {
		
		String repoIndictor = RepoIndicatorUtil.getRepoIndicator(Constants.STATE_MEDIATED, "SERVICETYPE");
		
		IUsageManagement usageMgmt = repoLookUpService.getRepository(repoIndictor);
		
		RawUsageListResponseVO lists = usageMgmt.getRawUsageList(null);

		return lists;
	}


}
