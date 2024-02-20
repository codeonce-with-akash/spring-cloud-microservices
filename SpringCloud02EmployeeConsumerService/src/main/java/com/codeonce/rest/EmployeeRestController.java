package com.codeonce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeonce.consumer.AddressRestConsumer;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@Autowired
	private AddressRestConsumer consumer;
	
	@GetMapping("/show")
	public ResponseEntity<String> showEmpDetails() {
		return ResponseEntity.ok("From Employee Getting Details Of Address As - "+consumer.consumeAddressServiceShow());
	}
}
