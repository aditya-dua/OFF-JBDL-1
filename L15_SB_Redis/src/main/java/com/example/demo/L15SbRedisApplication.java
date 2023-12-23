package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class L15SbRedisApplication {

	@Autowired
	private ProductRepo dao;
	
	public static void main(String[] args) {
		SpringApplication.run(L15SbRedisApplication.class, args);
	}

	@GetMapping("/")
	public List<Object> fetchallProducts(){
		System.out.println("Without Product Hash");
		return dao.getAll();
	}
	
	@PostMapping("/")
	public Product save(@RequestBody Product product) {
		return dao.save(product);
		
	}
	
	@GetMapping("/test")
	public String test(){
		return "Get All Products";
	}
}
