package com.example.demo.model;

public class CreateEmployeeResponseModel {
	
	private int id;
	private String name;
	private String username;
	private String email;
	private int status;
	private String message;
	
	
	public CreateEmployeeResponseModel(int status, String message) {
		super();
		this.status = status;
		this.message = message;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public CreateEmployeeResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CreateEmployeeResponseModel(int id, String name, String username, String email, int status, String message) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.status = status;
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
