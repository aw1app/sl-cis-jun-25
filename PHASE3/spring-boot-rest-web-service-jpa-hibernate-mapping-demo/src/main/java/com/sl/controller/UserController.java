package com.sl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sl.entity.User;
import com.sl.entity.dto.UserDTO;
import com.sl.repositry.UserRepositry;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepositry userRepo;

	// task-2
	@GetMapping("/user-details/{userId}/{details}")
	public Object userDetails(@PathVariable int userId, @PathVariable String details) {

		User user = userRepo.findById(userId).orElseThrow();

		switch (details.toLowerCase()) {
		case "basic":
			return new UserDTO(user);

		case "full":
			return user;

		case "orders":
			return user.getOrders(); // returns just the orders list

		default:
			return ResponseEntity.badRequest().body("Invalid details type. Use 'basic', 'full', or 'orders'.");
		}
	}

}
