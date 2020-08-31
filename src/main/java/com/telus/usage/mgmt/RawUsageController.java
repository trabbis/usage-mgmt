package com.telus.usage.mgmt;


import java.time.LocalDate;

import javax.validation.ValidationException;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.beans.SearchRawUsageVO;
import com.telus.usage.mgmt.response.RawUsageListResponse;
import com.telus.usage.mgmt.services.RawUsageService;
import com.telus.usage.mgmt.util.Convertor;


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
			@RequestParam(value = "batchNumber", required = true) Long batchNumber,
			@RequestParam(value = "fromDate", required = true)  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
			@RequestParam(value = "toDate", required = true)  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate) throws Exception {

		
		SearchRawUsageVO searchRawUsageVO = new SearchRawUsageVO();
		searchRawUsageVO.setFromDate(fromDate.toString());
		searchRawUsageVO.setToDate(toDate.toString());
		searchRawUsageVO.setPhoneNumber(phoneNumber);
		searchRawUsageVO.setServiceType(serviceType);
		Convertor.validateInputParameters(searchRawUsageVO);
		
		SearchRawUsageListVO searchRawUsageListVO = new SearchRawUsageListVO();
		searchRawUsageListVO.setBatchNumber(batchNumber == null ? 0L : batchNumber);
		searchRawUsageListVO.setSearchRawUsage(searchRawUsageVO);
		
		RawUsageListResponse response = rawUsageService.getRawUsageList(searchRawUsageListVO);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	
	
	
	
}
