package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext apc=new AnnotationConfigApplicationContext(AppConfi.class);
		
		student student=(com.student) apc.getBean("student");
		
		System.out.println(student);
		
		
	}

}
