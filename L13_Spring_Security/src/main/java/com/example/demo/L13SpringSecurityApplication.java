package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class L13SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(L13SpringSecurityApplication.class, args);
	}
	
	@GetMapping("/user")
	public String user() {
		return "User Page";
	}

	@GetMapping("/home")
	public String home() {
		return "Home Page";
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test Page";
	}

}
