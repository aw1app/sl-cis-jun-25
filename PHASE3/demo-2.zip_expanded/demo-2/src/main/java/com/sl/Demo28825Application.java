package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sl"})
public class Demo28825Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo28825Application.class, args);
	}

}
