package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		University university = (University) apc.getBean("u");
		System.out.println(university);
		System.out.println(university.hashCode());
		System.out.println(university.getCollege().hashCode());
		
		
		University university1 = (University) apc.getBean("u");
		System.out.println(university1);
		System.out.println(university1.hashCode());
		System.out.println(university1.getCollege().hashCode());
		
	}

}
