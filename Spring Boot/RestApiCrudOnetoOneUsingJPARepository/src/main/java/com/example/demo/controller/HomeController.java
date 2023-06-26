package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.studentService;
import com.example.demo.entity.student;

@RestController
public class HomeController {
	
	
	@Autowired
	private studentService studentservice;
	
	
	
	@PostMapping(value="/addstu")
	public String getStudentData(@RequestBody student student) {
		System.out.println("stu data:" +student);
		studentservice.addstudData(student);
		return "Data Inserted";
		
	}
	
	@GetMapping(value="/get")
	public student getLoginData(@RequestParam String uname,@RequestParam String pass)
	{
		System.out.println("check login "+uname+""+pass);
		student student=studentservice.getLogindata(uname, pass);
		return student;
		
	}
	
	@GetMapping(value="/getAll")
	public List<student > getAll(){
		List<student>slist=studentservice.getAllData();
		return slist;
	}
	
	
}
