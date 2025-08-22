package com.sl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	
	@GetMapping("/abc/*.xyz")
	@ResponseBody
	public String welcome() {
		
		return "<h2>WELOCOME WELCOME</h2>";	// send the literal "<h2>ABC</h2>" to the browser
	}
	
	@GetMapping("/1")
	public String welcome1() {
		
		return "ab";	// render ab.jsp in the browser	
	}
	
	
	@GetMapping("/2")
	@ResponseBody
	public String welcome2() {
		
		return "<h2>ABC</h2>";	// send the literal "<h2>ABC</h2>" to the browser
	}
	
	@GetMapping(value= "/3", produces = "application/json")
	@ResponseBody
	public Greeting welcome3() {
		
		Greeting greeting = new Greeting("Hello", "World");
		
		return greeting;	// send { message1: "Hello", message2: "World"}
	}
	
	

}
