package com.sl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.sl.dto.UserResponse;

@Controller
@RequestMapping("/users")
public class UIUserController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/list")
	public String allUsers(Model model) {
		
		UserResponse[] userResponses =restTemplate.getForObject("http://spring-boot-user-microservice/users",UserResponse[].class);
		
		model.addAttribute("userResponses", userResponses);
		
		return "users" ; // 
	}

}
