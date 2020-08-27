package com.telus.usage.mgmt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.repository.DynamicAutowireRepository;
import com.telus.usage.mgmt.repository.IJdbcRepository;
import com.telus.usage.mgmt.response.RawUsageListResponse;
import com.telus.usage.mgmt.util.Convertor;

@Service
public class RawUsageService {
	
	@Autowired
	private DynamicAutowireRepository dynamicAutowireRepository;
	
	public RawUsageListResponse getRawUsageList(SearchRawUsageListVO searchRawUsageListVO) throws Exception {
		
		IJdbcRepository jdbcRepository = dynamicAutowireRepository.getRepository("RAW");
		
		RawUsageListResponseVO lists = jdbcRepository.getRawUsageList(searchRawUsageListVO);
		
		return Convertor.convert(lists);
		
	}


}
