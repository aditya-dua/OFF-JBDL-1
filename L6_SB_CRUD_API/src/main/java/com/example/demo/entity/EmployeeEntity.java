package com.example.demo.entity;

public class EmployeeEntity {
	
	private int id;
	private String name;
	// Logic for email is username+"@example.com"

	private String email;
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		this.setEmail(username+"@example.com");
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EmployeeEntity(int id, String name, String username) {
		super();
		this.id = id;
		this.name = name;
		this.username=username;
		this.email = username+"@example.com";
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
