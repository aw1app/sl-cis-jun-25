package webdemo;

import org.springframework.stereotype.Component;

@Component
public class Greeting {

	public String message1;
	public String message2;

	public Greeting(String message1, String message2) {
		super();
		this.message1 = message1;
		this.message2 = message2;
	}

}
