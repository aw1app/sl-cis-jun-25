package com.sl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;



public class UserDAO {
	
	@Autowired
	JdbcTemplate userJDBCTemplate;
	
	
	public void setUserJDBCTemplate(JdbcTemplate jdbctemplate) {
		this.userJDBCTemplate = jdbctemplate;
	}
	
	
	//CRUD Ops	
	// 1. Read (List) all users from Users table 
	
	public List<User> getAllUsers(){
		return this.userJDBCTemplate.query("SELECT * FROM USERS", new UserRowMapper());		
	}
	
	// 2. Create ops 
	public int insertUser(User u){
		return this.userJDBCTemplate.update(
				"INSERT INTO USERS(Username, Email) VALUES(?,?) ",
				u.getName(), u.getEmail()
				);		
	}

}


class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNumber) throws SQLException {
		
		User user = new User();
		
		int userID = rs.getInt("UserID");
		String userName = rs.getString("Username");
		String email = rs.getString("Email");
		
		user.setUserID(userID);
		user.setName(userName);
		user.setEmail(email);
		
		return user;
	}
	
	
	
}
