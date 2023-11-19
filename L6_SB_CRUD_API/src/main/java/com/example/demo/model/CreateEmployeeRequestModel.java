package com.example.demo.model;

public class CreateEmployeeRequestModel {
	
	private int id;
	private String name;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public CreateEmployeeRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateEmployeeRequestModel(int id, String name, String username) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
	}
	

}
