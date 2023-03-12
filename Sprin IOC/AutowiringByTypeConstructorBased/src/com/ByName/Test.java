package com.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext apc=new ClassPathXmlApplicationContext("com/ByName/NewFile.xml");
	College college=(College) apc.getBean("c");
	System.out.println(college);
	System.out.println(college.getStudent());
	System.out.println(college.getStudent1());
}
}
