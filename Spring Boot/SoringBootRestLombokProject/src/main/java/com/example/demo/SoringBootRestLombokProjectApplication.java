package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;

@SpringBootApplication
public class SoringBootRestLombokProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoringBootRestLombokProjectApplication.class, args);
		
//		Student stu = new Student();
//		stu.setId(11); stu.setName("ABC"); stu.setAdress("pune");
//		System.out.println(stu);
		
		Student stu1=Student.builder().id(112).name("rajshri").Adress("akurdi").build();
		System.out.println(stu1);
	}

}
