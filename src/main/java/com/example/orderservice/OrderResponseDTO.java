package com.example.orderservice;

import lombok.Data;

@Data
public class OrderResponseDTO {
    private Long orderId;
    private Object user;
    private Object product;
    
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Object getUser() {
		return user;
	}
	public void setUser(Object user) {
		this.user = user;
	}
	public Object getProduct() {
		return product;
	}
	public void setProduct(Object product) {
		this.product = product;
	}
    
}