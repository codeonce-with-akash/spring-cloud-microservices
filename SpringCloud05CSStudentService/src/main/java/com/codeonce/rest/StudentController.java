package com.codeonce.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
@RefreshScope
public class StudentController {
	@Value("${code}")
	private String code;
	
	@GetMapping("/code")
	public ResponseEntity<String> getCode(){
		return ResponseEntity.ok("STUDENT NAME: "+code);
	}
}
