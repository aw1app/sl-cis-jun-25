package com.sl;

public class Product {

	String name;
	float price;

	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
