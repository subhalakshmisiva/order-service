package com.example.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{orderId}/user/{userId}/product/{productId}")
    public OrderResponseDTO getOrderDetails(
            @PathVariable Long orderId,
            @PathVariable Long userId,
            @PathVariable Long productId) {

        // Fetch user from User Service (port 8081)
        String userServiceUrl = "http://localhost:8081/users/" + userId;
        Object user = restTemplate.getForObject(userServiceUrl, Object.class);

        // Fetch product from Product Service (port 8082)
        String productServiceUrl = "http://localhost:8082/products/" + productId;
        Object product = restTemplate.getForObject(productServiceUrl, Object.class);

        // Aggregate response
        OrderResponseDTO response = new OrderResponseDTO();
        response.setOrderId(orderId);
        response.setUser(user);
        response.setProduct(product);

        return response;
    }
}