package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@RestController
public class UserController {

	private final UserRepo userRepo;
	
	@Autowired
	public UserController(UserRepo repo) {
		// TODO Auto-generated constructor stub
		this.userRepo=repo;
	}
	
	@GetMapping("/load")
	public String load() {
		System.out.println("Count:"+userRepo.count());
		
		User u1 = new User(1, "Aditya", 1000);
		User u2 = new User(2, "Rohan", 12000);
		User u3 = new User(3, "David", 10000);
		
		userRepo.save(u1);
		userRepo.save(u2);
		userRepo.save(u3);
		
		return ("New Loaded Count:"+userRepo.count());
		
	}
	/*
	 * Spring Expression Language (SpEL) expression used to veto method caching. 
	 * Veto caching the result if the condition evaluates to true.
	 */
	@GetMapping("/{userId}")
	@Cacheable(value="users-off1", key="#userId")
	public Optional<User> getUser(@PathVariable int userId) {
		
		return userRepo.findById(userId);
	}
	
	@DeleteMapping("/delete/{userId}")
	@CacheEvict(value="users-off1", key="#userId")
	public String delete(@PathVariable int userId) {
		userRepo.deleteById(userId);
		return "Success";
	}
	
}
