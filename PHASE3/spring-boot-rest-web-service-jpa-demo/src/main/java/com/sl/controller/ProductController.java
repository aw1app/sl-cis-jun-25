package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sl.entity.Product;
import com.sl.repositry.ProductRepositry;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductRepositry productRepositry;
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> products = productRepositry.findAll();
		
		return new ResponseEntity(products, HttpStatusCode.valueOf(200));
	}
	
	
	//Task-1: Create a mapping that will return details of a single product given the product id.
	// Test the implementation using postman app
	

}
