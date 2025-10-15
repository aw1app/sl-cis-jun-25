package com.sl.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sl.entity.dto.Order;

@Document(collection = "users")
public class User {

    @Id
    private String id;  // Mongo uses String IDs (ObjectId)

    private String username;
    private String email;


    List<Order> orders;
    
    // getters and setters
    
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}      
    
}

