package com.Configuration;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Pojo.College;
import com.Pojo.Student;
@Configuration
public class Appconfi {
@Bean
	public Student student() {
		Student stu = new Student();
		stu.setId(11);
		stu.setName("A");
		stu.setAdress("pune");
		stu.setList(c());
		
		Set<String>set=new HashSet<>();
		set.add("Rajshri");set.add("Bhagu");
		
		stu.setSet(set);
		
		Map<Integer, String>map=new HashMap<>();
		map.put(1, "Abc"); map.put(2, "pqr");
		
		stu.setMap(map);
		
		
			return stu;
}
		@Bean
		public List<College> c(){
		
			
			College clg=new College();
			clg.setId(1);clg.setName("Indira Collge");
			
			College clg1=new College();
			clg1.setId(2);clg1.setName("JSPM Collge");
			
			
			
			List<College> college=new ArrayList<>();
			college.add(clg); college.add(clg1);
			return  college;
			
			
			
			
		}
		
		
		

	}
	
