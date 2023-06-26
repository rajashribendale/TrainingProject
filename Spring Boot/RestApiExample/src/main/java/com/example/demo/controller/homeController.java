package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;

@RestController
public class homeController {
	
	@RequestMapping(value="/singleStudata")
	public Student getsinglestudata() {
		Student stu=new Student();
		stu.setId(11);
		stu.setName("A");
		stu.setAdress("pune");
		return stu;
		
	}
	@RequestMapping(value="/multistudata")
	public List<Student> getmultistudata() {
		Student stu=new Student();
		stu.setId(11);
		stu.setName("A");
		stu.setAdress("pune");
		
		Student stu1=new Student();
		stu1.setId(12);
		stu1.setName("B");
		stu.setAdress("Pune");
		
		List<Student> slist=new ArrayList<Student>();
		slist.add(stu);slist.add(stu1);
		return slist;
	}
}
