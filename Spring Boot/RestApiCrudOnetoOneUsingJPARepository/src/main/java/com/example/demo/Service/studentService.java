package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.student;

public interface studentService {
	
	void addstudData(student student );
	
	student getLogindata(String un,String ps);
	List<student > getAllData();

}
