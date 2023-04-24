package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;

@SpringBootApplication
public class SoringBootYmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoringBootYmlApplication.class, args);
		
		
		Student s=new Student();
		s.setName("Abc");
		s.setAdress("pune");
		System.out.println(s);
	}

}
