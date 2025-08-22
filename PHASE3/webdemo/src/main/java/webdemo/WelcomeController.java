package webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "ab";	// go to ab.jsp	
	}
	
	
	@GetMapping("/welcome1")
	@ResponseBody
	public String welcome1() {
		
		return "a";	// send the literal "a"	
	}

}
