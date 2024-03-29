package com.codeonce.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gst")
public class GstRestController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/show")
	public String getDetails() {
		return "FROM GST : "+port;
	}
}
