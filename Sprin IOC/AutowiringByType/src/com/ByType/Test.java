package com.ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		Student student = (Student) apc.getBean("s");
		System.out.println(student);
//		System.out.println(student.hashCode());
		System.out.println(student.getCollege());
//		System.out.println(student.getCollege().hashCode());
		
	}

}
