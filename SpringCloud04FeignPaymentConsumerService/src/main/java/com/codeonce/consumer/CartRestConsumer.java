package com.codeonce.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.codeonce.model.Cart;

@FeignClient("CART-SERVICE")
public interface CartRestConsumer {
	
	@GetMapping("/cart/info")
	public String getCartInfo();
	
	@PostMapping("/cart/create")
	public ResponseEntity<Cart> createCart(@RequestBody Cart cart);
	
	@GetMapping("/cart/find/one/{cartId}")
	public ResponseEntity<Cart> getCartDetailsByCartId(@PathVariable Integer cartId);
}
