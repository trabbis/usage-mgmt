package com.telus.mediation.usage.tmf635.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telus.mediation.usage.tmf635.exception.ValidationException;
import com.telus.mediation.usage.tmf635.model.DataServiceEventVO;
import com.telus.mediation.usage.tmf635.model.RawUsageDetailResponseVO;
import com.telus.mediation.usage.tmf635.model.RawUsageListResponseVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageDetailVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageListVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageVO;
import com.telus.mediation.usage.tmf635.repository.IUsageManagement;
import com.telus.mediation.usage.tmf635.repository.RepositoryLookUpService;
import com.telus.mediation.usage.tmf635.response.RawUsageListResponse;
import com.telus.mediation.usage.tmf635.response.Usage;
import com.telus.mediation.usage.tmf635.util.Constants;
import com.telus.mediation.usage.tmf635.util.Convertor;
import com.telus.mediation.usage.tmf635.util.RepoIndicatorUtil;

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
