package com.sl;

public class Product {
	
	String name;
	float price;
	float quantity;
	
	public Product() {
		
	}
		
	
	
	public Product(String name, float price, float quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}
	
	public float getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	

}