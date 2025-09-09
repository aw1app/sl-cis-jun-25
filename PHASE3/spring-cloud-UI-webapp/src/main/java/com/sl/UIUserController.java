package com.sl;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.sl.dto.OrderResponse;
import com.sl.dto.UserResponse;

@Controller
@RequestMapping("/users")
public class UIUserController {

	@Autowired
	RestTemplate restTemplate;
	
	private static final Logger logger = LoggerFactory.getLogger(UIUserController.class);

	@GetMapping("/list")
	public String allUsers(Model model) {

		UserResponse[] userResponses = restTemplate.getForObject("http://spring-boot-user-microservice/users",
				UserResponse[].class);

		model.addAttribute("userResponses", userResponses);
		
		// let's log what's in userResponses.
//		logger.info("info userResponses count is " + userResponses.length);
//		logger.warn("warn userResponses count is " + userResponses.length);
//		logger.error("error userResponses count is " + userResponses.length);
		

		return "users"; // user has user details but with orders details
	}

	// Task: Single user details.
	// user with user details all with orders details
	// SOLN: 
	// A. Fetch the basic user details like name and email from the User MS
	// B. Fetch all orders for this user from Order MS
	@GetMapping("/user/{userId}")
	public String getUserDetails(@PathVariable("userId") String userId, Model model) {

		UserResponse userResponse = restTemplate.getForObject("http://spring-boot-user-microservice/users/"+userId,
				UserResponse.class);
		
		model.addAttribute("userResponse", userResponse);
		
		String ordersUrl = "http://spring-boot-order-microservice/orders/user/"+userId;
		
		OrderResponse[] orderResponses = restTemplate.getForObject(ordersUrl, OrderResponse[].class);

		model.addAttribute("orderResponses", orderResponses);

		return "user";
	}

}
