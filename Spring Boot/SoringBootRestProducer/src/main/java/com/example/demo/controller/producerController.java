package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class producerController {
	
	@GetMapping(value="/getstu")
	public ResponseEntity<Student> producestudentData() {
		Student student=new Student();
		student.setId(11); student.setName("Abc");
		student.setAddress("Pune");
		return ResponseEntity.ok(student);
		
	}
	@GetMapping(value="/getliststu")
	public ResponseEntity<List<Student>> producestudentDataList() {
		List<Student>list=new ArrayList<Student>();
		
	
		Student student=new Student();
		student.setId(11); student.setName("Abc");
		student.setAddress("Pune");
		
		Student student1=new Student();
		student1.setId(12); student1.setName("Pqr");
		student1.setAddress("Pimpri");
		
		list.add(student);list.add(student1);
		return ResponseEntity.ok(list);
	}	

}
