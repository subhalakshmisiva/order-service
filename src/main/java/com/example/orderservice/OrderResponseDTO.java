package com.example.orderservice;

import lombok.Data;

@Data
public class OrderResponseDTO {
    private Long orderId;
    private UserDTO user;
    private ProductDTO product;
    
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
    
    
}