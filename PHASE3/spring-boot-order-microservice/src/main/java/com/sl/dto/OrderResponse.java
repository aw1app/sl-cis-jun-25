package com.sl.dto;

import java.util.List;

public class OrderResponse {
    private int orderId;
    private double amount;
    private List<Product> products;

    public OrderResponse(int orderId, double amount, List<Product> products) {
        this.orderId = orderId;
        this.amount = amount;
        this.products = products;
    }

    
    // getters/setters
    
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

   
    
    
}
