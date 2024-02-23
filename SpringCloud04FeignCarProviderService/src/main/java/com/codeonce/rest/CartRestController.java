package com.codeonce.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeonce.model.Cart;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/info")
	public String getCartInfo() {
		return "Cart Running On Port Number : "+port;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Cart> createCart(@RequestBody Cart cart){
		return new ResponseEntity<>(cart,HttpStatus.CREATED);
	}
	
	@GetMapping("/find/one/{cartId}")
	public ResponseEntity<Cart> getCartDetailsById(@PathVariable Integer cartId){
		return ResponseEntity.ok(new Cart(555, "CODEONCE", 777.0));
	}
}
