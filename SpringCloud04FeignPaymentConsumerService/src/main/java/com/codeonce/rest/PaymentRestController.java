package com.codeonce.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeonce.consumer.CartRestConsumer;
import com.codeonce.model.Cart;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	
	@Autowired
	private CartRestConsumer consumer;
	
	@GetMapping("/info")
	public ResponseEntity<String> getPaymentInfo(){
		return ResponseEntity.ok("From Payement "+consumer.getCartInfo());
	}
	
	@PostMapping("/create")
	public ResponseEntity<Cart> createCart(@RequestBody Cart cart){
		return consumer.createCart(cart);
	}
	
	@GetMapping("/find/one/{cartId}")
	public ResponseEntity<Cart> getCartDetailsByCartId(@PathVariable Integer cartId){
		return consumer.getCartDetailsByCartId(cartId);
	}
}
