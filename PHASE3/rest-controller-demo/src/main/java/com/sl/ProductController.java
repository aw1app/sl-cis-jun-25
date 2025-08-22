package com.sl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController{
	
	
	
	@GetMapping("/1")
	public Product getProduct() {
		
		return new Product(1, "Laptop", "High end professional laptop", 100000.0f);		
	}
	

}