package com.sl.entity.dto;

import com.sl.entity.User;

public class UserDTO {
    private int userId;
    private String username;
    private String email;

    // constructor
    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.username = user.getUsername();
        this.email = user.getEmail();
    }

    // getters
    
	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}   
    
}

