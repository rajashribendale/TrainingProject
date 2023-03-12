package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		Student student = (Student) apc.getBean("s");
		System.out.println(student);
		
		
		College c=(College) apc.getBean("c");
		System.out.println(c);
		
	}

}
