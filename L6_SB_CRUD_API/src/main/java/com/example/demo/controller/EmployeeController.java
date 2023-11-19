package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.CreateEmployeeRequestModel;
import com.example.demo.model.CreateEmployeeResponseModel;
import com.example.demo.model.GetEmployeeResponseModel;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	// <>/employee/test
	@GetMapping("/test")
	public String test() {
		return "Test API works!";
	}
	@PostMapping("/create")
	public CreateEmployeeResponseModel createEmployee(@RequestBody CreateEmployeeRequestModel request) {
		return service.createEmployee(request);
	}
	
	@GetMapping("/load")
	public String load(@RequestParam int num) {
		return service.load(num);
	}
	
	@GetMapping("/getAll")
	public List<EmployeeEntity> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/get/{id}")
	public GetEmployeeResponseModel getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	
}
