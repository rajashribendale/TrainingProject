package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("NewFile.xml");
		
		University u=(University) apc.getBean("u");
		System.out.println(u);
	}

}
