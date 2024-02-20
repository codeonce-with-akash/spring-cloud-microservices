package com.codeonce.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addrs")
public class AddressRestController {
	
	@GetMapping("/show")
	public String showAddress() {
		return "From Address - "+System.currentTimeMillis();
	}
}
