package com.sl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

	@Autowired
	UserDAO userDAO;

	@GetMapping("/list-users")
	public String listUsers(ModelMap model) {
		
		List<User> users = userDAO.getAllUsers();
		
		model.addAttribute("users", users);
		
		return "list-users" ; // render /WEB-INF/views/list-users.jsp		
	}
	
	
	@PostMapping("/new-user")
	public String createUser(User user,  ModelMap model) {
		
		int count = userDAO.insertUser(user);
		model.addAttribute("count", count);
		
		return "create-user-success" ; // render /WEB-INF/views/create-user-success.jsp
		
	}

	

}