package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SoringBootRestJsonToJavaApplication {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		SpringApplication.run(SoringBootRestJsonToJavaApplication.class, args);

		String str = "{\"id\":1, \"name\":\"Rajshri\", \"address\":\"Pune\"}";

		ObjectMapper obj = new ObjectMapper();
		Student stu = obj.readValue(str, Student.class);
		System.out.println("Converted Json to object:" + stu);

		System.out.println("************************************");
		String str1 = obj.writeValueAsString(stu);
		System.out.println("Converted Object to json:" + str1);

	}

}
