package com.example.demo.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.CreateEmployeeRequestModel;
import com.example.demo.model.CreateEmployeeResponseModel;
import com.example.demo.model.GetEmployeeResponseModel;

@Service
public class EmployeeService {

	HashMap<Integer, EmployeeEntity> empHM;
	
	/**
	 * ResponseEntity<Employee,Error>
	 * {status:
	 * message:
	 * data:{
	 * id:
	 * name:
	 * username:
	 * }}
	 * 
	 * @param request
	 * @return
	 */
	
	public CreateEmployeeResponseModel createEmployee(CreateEmployeeRequestModel request) {
		CreateEmployeeResponseModel response;
		if(empHM == null) {
			empHM = new HashMap<Integer, EmployeeEntity>();
		}
		
		EmployeeEntity emp = new EmployeeEntity(request.getId(), request.getName(),request.getUsername());
		
		empHM.put(emp.getId(), emp);
		
		if(empHM.containsKey(emp.getId())) {
			response = new CreateEmployeeResponseModel(emp.getId(), emp.getName(), emp.getUsername(), emp.getEmail(), 200, "Success");
		}else {
			response = new CreateEmployeeResponseModel(501, "Error Saving Employee");
		}
		return response;
	}
	
	public String load(int num) {
		EmployeeEntity emp;
		if(empHM == null) {
			empHM = new HashMap<Integer, EmployeeEntity>();
		}
		
		for(int i=0;i<num;i++) {
			emp = new EmployeeEntity(i+1, "User"+i,"username_"+i);
			empHM.put(emp.getId(), emp);
		}
		
		System.out.println("Map Size:"+empHM.size());
		
		return "Success";
	}
	
	public List<EmployeeEntity> getAll() {
		ArrayList<EmployeeEntity> empList = new ArrayList<EmployeeEntity>();
		
		for (Map.Entry<Integer, EmployeeEntity> entry : empHM.entrySet()) {
			Integer key = entry.getKey();
			EmployeeEntity val = entry.getValue();
			empList.add(val);
			
		}
		
		return empList;
	}
	
	public GetEmployeeResponseModel getById(int id) {
		GetEmployeeResponseModel response;
		EmployeeEntity emp ;
		if(empHM.containsKey(id)) {
			emp = empHM.get(id);
			response = new GetEmployeeResponseModel(emp.getId(),emp.getName(),emp.getUsername(),emp.getEmail(),200,"Success");
		}else {
			response = new GetEmployeeResponseModel(501,"Error fetching data");
		}
		
		return response;
	}
	
	/*
	 * Update function...input: id, {updated fields} output: final updated employee object
	 * Delete function input: id, output: {}employee
	 * 
	 * CSV file....
	 * import the csv file into the Hashmap
	 * 
	 */
}
