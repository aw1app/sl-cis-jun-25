package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController{
	
	@PostMapping("/product-new")
	@ResponseBody
	public String createProduct(
			@RequestParam("name") String name,
			@RequestParam("price") float price,
			@RequestParam("desc") String desc) 
	{
		
		// some business logic here.
		
		return "Successfully Created a new product! [ " + name +" , "+ price  +" ]";
	}


}