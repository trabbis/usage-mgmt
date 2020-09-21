package com.telus.mediation.usage.tmf635;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telus.mediation.usage.tmf635.model.RawUsageListResponseVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageDetailVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageListVO;
import com.telus.mediation.usage.tmf635.model.SearchRawUsageVO;
import com.telus.mediation.usage.tmf635.response.RawUsageListResponse;
import com.telus.mediation.usage.tmf635.response.Usage;
import com.telus.mediation.usage.tmf635.service.RawUsageService;
import com.telus.mediation.usage.tmf635.util.Convertor;


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

	@GetMapping("/getRawUsageList/{id}")
	public @ResponseBody ResponseEntity<Object> getRawUsageList(
			@PathVariable Long id) throws Exception {

		
		SearchRawUsageDetailVO searchRawUsageDetailVO = new SearchRawUsageDetailVO();
		searchRawUsageDetailVO.setDataServiceEventId(id);
		List<Usage> response = rawUsageService.getRawUsageDetail(searchRawUsageDetailVO);
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	
	
	@GetMapping("/getRawUsageList")
	public @ResponseBody ResponseEntity<Object> getRawUsageList(
			@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
			@RequestParam(value = "serviceType", required = true) String serviceType,
			@RequestParam(value = "batchNumber", required = false) Long batchNumber,
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
		
		List<Usage> response = rawUsageService.getRawUsageList(searchRawUsageListVO);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	
	
	
}
