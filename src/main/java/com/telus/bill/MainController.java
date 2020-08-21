package com.telus.bill;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telus.bill.repository.TeamMember;
import com.telus.bill.repository.JdbcRepository;
import com.telus.bill.repository.RawUsageListResponseVO;

@RestController
public class MainController {

	@Autowired
	private JdbcRepository jdbcRepository;
	
	@GetMapping("/hello")
	public @ResponseBody ResponseEntity<Object> hello() {

		String version = "Welcome2...";
		return new ResponseEntity<>(version, HttpStatus.OK);
	}

	@GetMapping("/teamMember")
	public @ResponseBody ResponseEntity<Object> getTeamMember() {

		//String version = "Welcome...";
		
		List<TeamMember> lists = jdbcRepository.findByNameAndPrice("T010050");
		
		return new ResponseEntity<>(lists, HttpStatus.OK);
	}
	
	@GetMapping("/getRawUsageList")
	public @ResponseBody ResponseEntity<Object> getRawUsageList() {

		RawUsageListResponseVO lists = jdbcRepository.getRawUsageList("WISP");
		
		return new ResponseEntity<>(lists, HttpStatus.OK);
	}
	
	
	
	
}
