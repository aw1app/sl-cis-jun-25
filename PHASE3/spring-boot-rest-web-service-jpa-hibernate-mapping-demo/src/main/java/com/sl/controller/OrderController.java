package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sl.entity.Order;
import com.sl.entity.Product;
import com.sl.entity.User;
import com.sl.repositry.OrderRepositry;
import com.sl.repositry.ProductRepositry;
import com.sl.repositry.UserRepositry;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired	ProductRepositry productRepositry;
	
	@Autowired 	UserRepositry userRepo;
	
	@Autowired	OrderRepositry orderRepositry;
	
	
	@PostMapping("/create-order/{userId}")
	public Order createOrder(@PathVariable int userId, @RequestBody List<Integer> productIds) {
		
		User user = userRepo.findById(userId).orElseThrow();		
		
		List<Product> products = productRepositry.findAllById(productIds);
		double amount = products.stream().mapToDouble(Product::getPrice).sum();
		
		Order order = new Order();
		
		order.setUser(user);
		order.setProducts(products);
		order.setAmount(amount);				 
		
		Order saveOrder = orderRepositry.save(order);
		
		return 	saveOrder;	
	}
	
	
	@GetMapping("/order-details/{orderId}")
	public Order orderDetails(@PathVariable int orderId) {
		
		Order order = orderRepositry.findById(orderId).orElseThrow();		
		
		return order;		
	}
	
	
	//Task-1: Implement Edit order, update the products list in that order
	@PostMapping("/order-update/{orderId}")
	public Order updateOrder(@PathVariable int orderId, @RequestBody List<Integer> productIds) {
	
		// your code here
		
		return null;
	}
	

}
