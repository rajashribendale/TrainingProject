package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

@RestController
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/consumStu")
	public ResponseEntity<Student> consumerStudent() {
		ResponseEntity<Student> responseEntity = restTemplate.getForEntity("http://localhost:9000/getstu",
				Student.class);
		Student student = responseEntity.getBody();
		return responseEntity.ok(student);

	}

	@GetMapping(value = "/consumlistStu")
	public ResponseEntity<List<Student>> consumerlistDataStudent() {
		ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:9000/getliststu", List.class);
		List<Student> list = responseEntity.getBody();
		return responseEntity.ok(list);

	}

}
