package com.sl.dto;

import java.util.List;

public class UserResponse {

	private String id; // Mongo uses String IDs (ObjectId)

	private String username;
	private String email;

	List<OrderResponse> orderResponses;

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

	public List<OrderResponse> getOrderResponses() {
		return orderResponses;
	}

	public void setOrderResponses(List<OrderResponse> orderResponses) {
		this.orderResponses = orderResponses;
	}
	
	
	

}
