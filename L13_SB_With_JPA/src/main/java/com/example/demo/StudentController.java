package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService stuService;
	
	@GetMapping("/test")
	public String test() {
		return "Test API works";
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Student stu) {
		stuService.save(stu);
	}
	
	@GetMapping("/count")
	public long count() {
		return stuService.count();
	}
	
	
}
