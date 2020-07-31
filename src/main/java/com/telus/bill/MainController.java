package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping("/hello")
	public @ResponseBody ResponseEntity<Object> version() {

		String version = "Welcome...";
		return new ResponseEntity<>(version, HttpStatus.OK);
	}


	
}
