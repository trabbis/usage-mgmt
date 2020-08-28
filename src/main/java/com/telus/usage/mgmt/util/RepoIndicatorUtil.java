package com.telus.usage.mgmt.util;

import java.util.HashMap;
import java.util.Map;

public class RepoIndicatorUtil {

	private static Map<String, String> repoIndicators = null;

//	public RepoIndicatorUtil() {
	static {
		repoIndicators = new HashMap<String, String>();
		repoIndicators.put("rawWISP", "RAW");
		repoIndicators.put("mediatedSOMETHING", "MEDIATED");
		
	}
	public static String getRepoIndicator(String state, String serviceType) {
		
//    	serviceTypeList.add(searchRuVO.getServiceType());	    	
//    	ServiceFilter[] filters = buildServiceFilters(Constants.STATE_RAW, serviceTypeList); 

		StringBuffer sb = new StringBuffer();
		sb.append(Constants.STATE_RAW);
		sb.append(serviceType.toUpperCase());
		
		return repoIndicators.get(sb.toString());
		
	}

}
