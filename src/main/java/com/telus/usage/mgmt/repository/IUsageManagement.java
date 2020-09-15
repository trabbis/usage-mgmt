package com.telus.usage.mgmt.repository;

import com.telus.usage.mgmt.beans.RawUsageDetailResponseVO;
import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageDetailVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;

public interface IUsageManagement {

	public String getRepositoryCode();
	public RawUsageListResponseVO getRawUsageList(SearchRawUsageListVO searchRulVO);
//	public RawUsageCountResponseVO getRawUsageCount(SearchRawUsageCountVO searchRucVO);
	public RawUsageDetailResponseVO getRawUsageDetail(SearchRawUsageDetailVO searchRudVO);
	
	
}
