package com.sl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sl.entity.Product;
import com.sl.repositry.ProductRepositry;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepositry productRepositry;
	
	/* List  of all products */
	@GetMapping("/list-products")
	public String getAllProducts(ModelMap model) {
		
		List<Product> products = productRepositry.findAll();
		
		model.addAttribute("products", products);
		
		return "products"; // WEB_INF/views/products.jsp
	}
	
	/* Details of a single product */
	@GetMapping("/product/{id}")
	public String getAllProducts(@PathVariable("id") int id, ModelMap model) {
		
		Optional<Product> result = productRepositry.findById(id);
		
		Product product=null;
		if(result.isPresent()) {
			product = result.get();			
		}
		
		model.addAttribute("product", product);
		return "product"; // WEB_INF/views/product.jsp
	}

}
