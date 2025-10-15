package com.sl.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sl.entity.Product;

/*
 * How to do custom query based on property/field names of Entity annotated class 
 * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
 */

@Repository
public interface ProductRepositry extends JpaRepository<Product, Integer> {

	public List<Product> findAllByName(String name);

	public List<Product> findAllByNameContaining(String name); 
	// or public List<Product> findAllByNameLike(String name); 

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
	// SOLUTION:
	public List<Product> findAllByNameContainingAndPriceLessThan(String name,float price );
	
	
	// Task write a finder method to find all products whose name is "n" chars in length
	// NOTE : you cannot write one using what options we have in above doc file query-methods.html. We can only by using JPQL
	@Query(value = "SELECT p FROM Product p WHERE LENGTH(p.name) = :n")
	List<Product> findProductsWithNameLengthFive(int n);
	
	@Query(value = "SELECT * FROM products  WHERE length(name)=:n ", nativeQuery = true )
	List<Product> abc(@Param("n") int n);

}