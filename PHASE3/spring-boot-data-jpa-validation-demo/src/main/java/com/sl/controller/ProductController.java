package com.sl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sl.entity.Product;
import com.sl.repositry.ProductRepositry;

import jakarta.validation.Valid;

@Controller
public class ProductController {

	@Autowired
	ProductRepositry productRepositry;

	/* List of all products */
	@GetMapping("/list-products")
	public String getAllProducts(ModelMap model) {

		List<Product> products = productRepositry.findAll();

		model.addAttribute("products", products);
		model.addAttribute("product", new Product());

		return "products"; // WEB_INF/views/products.jsp
	}

	/* Details of a single product */
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id") int id, ModelMap model) {

		Optional<Product> result = productRepositry.findById(id);

		Product product = null;
		if (result.isPresent()) {
			product = result.get();
		}

		model.addAttribute("product", product);
		return "product"; // WEB_INF/views/product.jsp
	}

	/* Delete a single product */
	@GetMapping("/delete-product/{id}")
	public String deleteProduct(@PathVariable("id") int id, ModelMap model) {

		Optional<Product> result = productRepositry.findById(id);

		Product product = null;
		if (result.isPresent()) {
			productRepositry.deleteById(id);
		}

		return "redirect:/list-products"; // redirect to WEB_INF/views/list-products.jsp
	}

	/* Create a new product */
	@PostMapping("/new-product")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model) {
		
		model.addAttribute("products", productRepositry.findAll());
		
		if(result.hasErrors()) {			
			return "products"; // WEB_INF/views/products.jsp
		}
		
		productRepositry.save(product);
		
		return "redirect:/list-products"; // redirect to WEB_INF/views/products.jsp
	}

	
	/* Save Edited product */
	@PostMapping("/edit-product")
	public String saveProduct(Product product) {
		productRepositry.save(product);

		return "redirect:/list-products"; 
	}

}
