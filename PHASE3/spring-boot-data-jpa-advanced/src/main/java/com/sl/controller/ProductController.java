package com.sl.controller;

import java.util.List;

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


	/* List of all products */
	@GetMapping("/list-products/{name}")
	public String getAllProductsByName(@PathVariable("name") String name ,ModelMap model) {
		List<Product> products = null;
		
		if(name.equals("all"))
			products = productRepositry.findAll();
		else
		products = productRepositry.findAllByNameContaining(name);

		model.addAttribute("products", products);

		return "products"; // WEB_INF/views/products.jsp
	}
	
	
	/* List of all products with price less than */
	@GetMapping("/list-products-by-price/less-than/{price}")
	public String getAllProductsByPriceLessThan(@PathVariable("price") float price ,ModelMap model) {
		List<Product> products = productRepositry.findAllByPriceLessThan(price);

		model.addAttribute("products", products);

		return "products"; // WEB_INF/views/products.jsp
	}
	
	/* List of all products with price in range */
	@GetMapping("/list-products-by-price/in-range/{price1}/{price2}")
	public String getAllProductsByPriceInRange(@PathVariable("price1") float price1 ,@PathVariable("price2") float price2 ,ModelMap model) {
		List<Product> products = productRepositry.findAllByPriceBetween(price1,price2);

		model.addAttribute("products", products);

		return "products"; // WEB_INF/views/products.jsp
	}
	
	
	
	

}
