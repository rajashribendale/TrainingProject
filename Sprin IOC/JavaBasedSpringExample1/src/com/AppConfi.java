package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfi {
	@Bean
	public student student() {
		student student=new student();
		student.setId(11);
		student.setName("A");
		return student;
		
		
	}

}
