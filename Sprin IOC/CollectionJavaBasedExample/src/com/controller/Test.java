package com.controller;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Configuration.Appconfi;
import com.Pojo.Student;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext apc=new AnnotationConfigApplicationContext(Appconfi.class);
		Student student=(Student) apc.getBean("student");
		System.out.println(student);
		System.out.println(student.getList());
		System.out.println(student.getList().get(0));
		System.out.println(student.getList().get(1));
		
		Set<String>set=student.getSet();
		for (String string : set) {
			System.out.println(string);
		}
		
		
		System.out.println(student.getMap().keySet());
		System.out.println(student.getMap().entrySet());
	
	
		Map<Integer, String> map=student.getMap();
		map.forEach((k,v)->{
			System.out.println(" key = " +k+  "value= "+v);
		});
		
	}

}
