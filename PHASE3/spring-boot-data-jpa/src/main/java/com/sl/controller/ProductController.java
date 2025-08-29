package com.sl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.sl.entity.Product;
import com.sl.repositry.ProductRepositry;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepositry productRepositry;
	
	@GetMapping("/list-products")
	public String getAllProducts(ModelMap model) {
		
		List<Product> products = productRepositry.findAll();
		
		model.addAttribute("products", products);
		
		return "products"; // WEB_INF/views/products.jsp
	}

}
