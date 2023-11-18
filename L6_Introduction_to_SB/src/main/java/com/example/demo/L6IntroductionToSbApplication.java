package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/greeting/{name}")
	public String greeting(@PathVariable String name) {
		return "Hello "+name+",";
	}
	
	@GetMapping("/greeting")
	public String greetingWithURL(@RequestParam String name) {
		return "Hello "+name+",";
	}
	
	@GetMapping("/greeting/id/{id}")
	public String greeting(@PathVariable String id,@RequestParam String name ) {
		return "Hello "+name+" "+id+",";
	}
	
	@GetMapping("/signup/")
	public String registeration(@RequestParam String email,@RequestParam String password ) {
		return "Hello "+email+" "+password+",";
	}
	
	@PostMapping("/signup")
	public String registerationPost(@RequestBody User user) {
		System.out.println("User Object:"+user);
		return "User Created Successfully"+user;
	}

}
