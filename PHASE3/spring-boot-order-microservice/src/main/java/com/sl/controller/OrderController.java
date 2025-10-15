package com.sl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sl.dto.OrderResponse;
import com.sl.dto.Product;
import com.sl.entity.Order;
import com.sl.repositry.OrderRepositry;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderRepositry orderRepositry;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping
	public List<OrderResponse> getAllOrders() {

		List<Order> orders = orderRepositry.findAll();
		
		List<OrderResponse> orderResonses = new ArrayList<OrderResponse>();

		for (Order order : orders) {
			List<Integer> pids = order.getProductIds();

			List<Product> products= new ArrayList<Product>();
			
			for (int pid : pids) {
				Product prod = restTemplate.getForObject("http://spring-boot-product-microservice/products/details/" + pid,Product.class);
				products.add(prod);
			}		
			
			orderResonses.add(new OrderResponse(order.getOrderId(), order.getAmount(), products));
		};		
		

		return orderResonses;
	}
	
	@GetMapping("/user/{uid}")
	public List<OrderResponse> getAllOrdersOfUser(@PathVariable("uid") String uid) {

		List<Order> orders = orderRepositry.findAllOrdersByUserId(uid);
		System.out.println("<DEBUG> orders : " + orders);
		
		List<OrderResponse> orderResonses = new ArrayList<OrderResponse>();

		for (Order order : orders) {
			List<Integer> pids = order.getProductIds();

			List<Product> products= new ArrayList<Product>();
			
			for (int pid : pids) {
				Product prod = restTemplate.getForObject("http://spring-boot-product-microservice/products/details/" + pid,Product.class);
				products.add(prod);
			}		
			
			orderResonses.add(new OrderResponse(order.getOrderId(), order.getAmount(), products));
		};		
		

		return orderResonses;
	}
	

	@GetMapping("/details/{orderId}")
	public OrderResponse orderDetails(@PathVariable int orderId) {

		Order order = orderRepositry.findById(orderId).orElseThrow();
		
		List<Integer> pids = order.getProductIds();
		List<Product> products= new ArrayList<Product>();
		
		for (int pid : pids) {
			Product prod = restTemplate.getForObject("http://spring-boot-product-microservice/products/details/" + pid,Product.class);
			products.add(prod);
		};
		

		return new OrderResponse(order.getOrderId(), order.getAmount(), products);
	}

}