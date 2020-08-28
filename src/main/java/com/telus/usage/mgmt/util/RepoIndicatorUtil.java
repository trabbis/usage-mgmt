package com.telus.usage.mgmt.util;

import java.util.HashMap;
import java.util.Map;

public class RepoIndicatorUtil {

	private static Map<String, String> repoIndicators = null;

	static {
		//Keep the first key value in lowerCase and second key value in upperCase to make it more readable
		repoIndicators = new HashMap<String, String>();
		repoIndicators.put("rawWISP", "RAW");
		repoIndicators.put("mediatedSERVICETYPE", "MEDIATED");
		
	}
	public static String getRepoIndicator(String state, String serviceType) {
		
//    	serviceTypeList.add(searchRuVO.getServiceType());	    	
//    	ServiceFilter[] filters = buildServiceFilters(Constants.STATE_RAW, serviceTypeList); 

		StringBuffer sb = new StringBuffer();
		sb.append(state.toLowerCase());
		sb.append(serviceType.toUpperCase());
		
		return repoIndicators.get(sb.toString());
		
	}

}
