package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@PostMapping("/product-new-v2")
	@ResponseBody
	public String createProductV2(Product product) 
	{
		
		// some business logic here.
		
		return "Successfully Created a new product! [ " + product.name +" , "+ product.price  +" ]";
	}
	
	
	@PostMapping("/product-new-v3")
	public String createProductV3(Product product, ModelMap model) 
	{
		
		// some business logic here.
		model.addAttribute("product", product);
		
		return "new-product-success"; // render new-product-success.jsp
	}
	
	

}