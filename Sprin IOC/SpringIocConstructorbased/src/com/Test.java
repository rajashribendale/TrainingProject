package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext();
		college college=(college) ap.getBean("c");
		System.out.println(college);
		
	}

}
