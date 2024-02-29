package com.codeonce.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	
	@Value("${title}")
	private String data;
	
	@GetMapping("/data")
	public String getData() {
		return "FROM EMP SEVICE - "+data;
	}
}
