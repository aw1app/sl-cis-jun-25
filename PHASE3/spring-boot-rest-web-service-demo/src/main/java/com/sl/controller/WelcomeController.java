package com.sl.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sl.entity.Apple;

@RestController
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "welcome to spring rest web services";
	}
	
	
//	@GetMapping("/apple")
//	public Apple printAppleInfo() {
//		
//		return new Apple("Kashmir",120.25F);
//	}
	
	@GetMapping("/apple")
	public ResponseEntity<Apple> printAppleInfo() {
		
		Apple apple1 = new Apple("Kashmir",120.25F);
		
		return new ResponseEntity(apple1,HttpStatusCode.valueOf(201));
	}

}


