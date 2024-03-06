package com.codeonce.model;

public class Cart {
	private Integer cartId;
	private String code;
	private Double cost;

	public Cart() {

	}

	public Cart(Integer cartId, String code, Double cost) {
		super();
		this.cartId = cartId;
		this.code = code;
		this.cost = cost;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", code=" + code + ", cost=" + cost + "]";
	}

}
