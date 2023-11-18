package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class L6IntroductionToSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(L6IntroductionToSbApplication.class, args);
		
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test API works!";
	}

}
