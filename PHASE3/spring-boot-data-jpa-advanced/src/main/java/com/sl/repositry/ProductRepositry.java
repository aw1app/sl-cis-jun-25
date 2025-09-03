package com.sl.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sl.entity.Product;

@Repository
public interface ProductRepositry extends JpaRepository<Product, Integer> {

	public List<Product> findAllByName(String name);

	public List<Product> findAllByNameContaining(String name);

	// Task
	// Find all products having a particular price
	public List<Product> findAllByPrice(float price);

	// Task
	// Find all products having a price less than
	public List<Product> findAllByPriceLessThan(float price);

	// Task
	// Find all products having a price in range
	public List<Product> findAllByPriceBetween(float startPrice,float endPrice);
	
	// Task : Find all products containing particular chars in name and also they are less than some price 

}