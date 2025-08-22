package com.sl;

import org.springframework.stereotype.Component;

@Component
public class Product {

	String name;
	String desc;
	float price;

	public Product() {

	}

	public Product(String name, String desc, float price) {
		super();
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

}
