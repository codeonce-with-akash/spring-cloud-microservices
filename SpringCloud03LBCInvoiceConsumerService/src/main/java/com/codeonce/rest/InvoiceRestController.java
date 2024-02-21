package com.codeonce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeonce.consumer.GstRestConsumer;

@RestController
@RequestMapping("/invoice")
public class InvoiceRestController {
	
	@Autowired
	private GstRestConsumer consumer;
	
	@GetMapping("/show")
	public ResponseEntity<String> getDetails(){
		return ResponseEntity.ok("From Invoice Fetching The Details Of Gst As - "+consumer.getDetailsFromGst());
	}
}	
