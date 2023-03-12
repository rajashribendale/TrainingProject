package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("NewFile.xml");
		Employee e=(Employee) apc.getBean("e");
		System.out.println(e);
		System.out.println(e.hashCode());
		System.out.println(e.getCompnay().hashCode());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		 apc=new ClassPathXmlApplicationContext("NewFile.xml");
		Employee e1=(Employee) apc.getBean("e");
		System.out.println(e1);
		System.out.println(e.hashCode());
		System.out.println(e.getCompnay().hashCode());
		
		
	}

}
