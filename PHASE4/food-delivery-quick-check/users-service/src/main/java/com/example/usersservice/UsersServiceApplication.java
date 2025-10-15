package com.example.usersservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UsersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodsServiceApplication.class, args);
    }

    @GetMapping("/ping")
    public String ping() {
        return "Hello from the Foods Service!";
    }
}