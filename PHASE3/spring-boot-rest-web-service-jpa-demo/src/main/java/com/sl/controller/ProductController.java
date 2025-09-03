package com.sl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/details/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") int id){
		
		Optional<Product> result = productRepositry.findById(id);

		Product product = null;
		if (result.isPresent()) {
			product = result.get();
			return new ResponseEntity(product, HttpStatusCode.valueOf(200)); // 200 - request was successful
		}

		return new ResponseEntity(null, HttpStatusCode.valueOf(404));
	}
	
	// Creating new product
	@PostMapping("/create")
	public ResponseEntity<Product> createProduct(@RequestBody Product prod){
		
		Product product = productRepositry.save(prod);
		
		return new ResponseEntity(product, HttpStatusCode.valueOf(201));	// 201 - created successfully	
	}

}
