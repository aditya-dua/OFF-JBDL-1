package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo stuRepo;
	
	public void save(Student stu) {
		stuRepo.save(stu);
	}
	
	public long count() {
		return stuRepo.count();
	}
	
	
}
