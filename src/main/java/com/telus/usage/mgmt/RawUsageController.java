package com.telus.usage.mgmt;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telus.usage.mgmt.beans.RawUsageListResponseVO;
import com.telus.usage.mgmt.beans.SearchRawUsageListVO;
import com.telus.usage.mgmt.beans.TeamMember;
import com.telus.usage.mgmt.repository.JdbcRepository;

@RestController
public class RawUsageController {

	@Autowired
	private JdbcRepository jdbcRepository;
	
	@GetMapping("/")
	public @ResponseBody ResponseEntity<Object> hello() {

		String version = "Welcome...";
		return new ResponseEntity<>(version, HttpStatus.OK);
	}

	@GetMapping("/getRawUsageList")
	public @ResponseBody ResponseEntity<Object> getRawUsageList(
			@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
			@RequestParam(value = "serviceType", required = true) String serviceType,
			@RequestParam(value = "fromDate", required = true)  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String fromDate) {

		
		SearchRawUsageListVO searchRawUsageListVO = new SearchRawUsageListVO();
		
		RawUsageListResponseVO lists = jdbcRepository.getRawUsageList("WISP");
		
		return new ResponseEntity<>(lists, HttpStatus.OK);
	}
	
	
	
	
}
