package com.telus.usage.mgmt.services;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telus.usage.mgmt.beans.DataServiceEventVO;
import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
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

		//TODO convert to tmf structure
		List<Usage> usageList = new ArrayList<Usage>();
		List<DataServiceEventVO> rawUsageList = lists.getRawUsageList();
		for (DataServiceEventVO dataServiceEventVO : rawUsageList) {
			Usage usage = new Usage();
			
			usage.setId(String.valueOf(dataServiceEventVO.getDataServiceEventId()));
			usage.setType("raw");
			usage.setDate(Instant.now().toString());
			
			usage.addUsageCharacteristic("dataServiceEventTypeCd", dataServiceEventVO.getDataServiceEventTypeCd());
			usage.addUsageCharacteristic("networkFileId", dataServiceEventVO.getNetworkFileId());
			usage.addUsageCharacteristic("mediationTransactionId", dataServiceEventVO.getMediationTransactionId());
			
//			usage.addUsageCharateristic2("dataServiceEventTypeCd", dataServiceEventVO.getDataServiceEventTypeCd());
//			usage.addUsageCharateristic2("networkFileId", dataServiceEventVO.getNetworkFileId());
//			usage.addUsageCharateristic2("mediationTransactionId", dataServiceEventVO.getMediationTransactionId());
			usageList.add(usage);
		}
		
		//Convertor.convert(lists);
		return usageList; 
		
	}

	//Just for testing multiple dbs
	public RawUsageListResponseVO getRemediatedUsageList() throws Exception {
		
		String repoIndictor = RepoIndicatorUtil.getRepoIndicator(Constants.STATE_MEDIATED, "SERVICETYPE");
		
		IUsageManagement usageMgmt = repoLookUpService.getRepository(repoIndictor);
		
		RawUsageListResponseVO lists = usageMgmt.getRawUsageList(null);

		return lists;
	}


}
