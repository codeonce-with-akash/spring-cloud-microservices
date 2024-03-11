package com.codeonce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeonce.beans.Employee;
import com.codeonce.service.KafkaDataSenderService;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@Autowired
	private KafkaDataSenderService service;

	@PostMapping("/data")
	public ResponseEntity<String> produceEmployeeData(@RequestBody Employee emp) {
		return ResponseEntity.status(200).body(service.sendData(emp));
	}
}
