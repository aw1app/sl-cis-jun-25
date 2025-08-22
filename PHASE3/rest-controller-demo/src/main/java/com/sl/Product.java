package com.sl;

import org.springframework.stereotype.Component;

@Component
public class Product {

	int id;
	String name;
	String desc;
	float price;

	public Product() {

	}

	public Product(int id, String name, String desc, float price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
