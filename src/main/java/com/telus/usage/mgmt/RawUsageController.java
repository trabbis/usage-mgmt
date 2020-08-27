package com.telus.usage.mgmt;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.beans.SearchRawUsageVO;
import com.telus.usage.mgmt.response.RawUsageListResponse;
import com.telus.usage.mgmt.services.RawUsageService;

@RestController
public class RawUsageController {

	private static Logger log = LoggerFactory.getLogger(RawUsageController.class);
	
	@Autowired
	private RawUsageService rawUsageService;
	
	
	@GetMapping("/")
	public @ResponseBody ResponseEntity<Object> hello() {

		//TODO
		//Kibana friendly logging
		String version = "Welcome...";
		return new ResponseEntity<>(version, HttpStatus.OK);
	}
	
	@GetMapping("/getMediated")
	public @ResponseBody ResponseEntity<Object> getMediated() throws Exception {
		RawUsageListResponseVO lists = rawUsageService.getRemediatedUsageList();
		
		return new ResponseEntity<>(lists, HttpStatus.OK);
	}	

	@GetMapping("/getRawUsageList")
	public @ResponseBody ResponseEntity<Object> getRawUsageList(
			@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
			@RequestParam(value = "serviceType", required = true) String serviceType,
			@RequestParam(value = "fromDate", required = true)  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String fromDate,
			@RequestParam(value = "toDate", required = true)  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String toDate) throws Exception {

		
		SearchRawUsageListVO searchRawUsageListVO = new SearchRawUsageListVO();
		SearchRawUsageVO searchRawUsageVO = new SearchRawUsageVO();
		searchRawUsageVO.setFromDate(fromDate);
		searchRawUsageVO.setToDate(toDate);
		searchRawUsageVO.setPhoneNumber(phoneNumber);
		searchRawUsageVO.setServiceType(serviceType);
		
		searchRawUsageListVO.setSearchRawUsage(searchRawUsageVO);
		
		RawUsageListResponse response = rawUsageService.getRawUsageList(searchRawUsageListVO);

		//TODO custom ExceptionHandler
//		try {
//			response = Convertor.convert(lists);
//		} catch (Exception e) {
//			log.error(e.toString());
//			MultiValueMap<String, String> headers =  new LinkedMultiValueMap<>();
//			headers.add("service exception", e.getMessage());
//			return new ResponseEntity<>(e.getMessage(), headers, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	
	
}
