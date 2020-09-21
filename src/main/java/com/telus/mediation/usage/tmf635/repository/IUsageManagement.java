package com.telus.mediation.usage.tmf635.repository;

import com.telus.mediation.usage.tmf635.model.RawUsageDetailResponseVO;
import com.telus.mediation.usage.tmf635.model.RawUsageListResponseVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageDetailVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageListVO;

public interface IUsageManagement {

	public String getRepositoryCode();
	public RawUsageListResponseVO getRawUsageList(SearchRawUsageListVO searchRulVO);
//	public RawUsageCountResponseVO getRawUsageCount(SearchRawUsageCountVO searchRucVO);
	public RawUsageDetailResponseVO getRawUsageDetail(SearchRawUsageDetailVO searchRudVO);
	
	
}
