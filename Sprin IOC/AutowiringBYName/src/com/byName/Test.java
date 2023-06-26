package com.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		customer customer = (customer) apc.getBean("c");
		System.out.println(customer);
		System.out.println(customer.getAdress());
		System.out.println(customer.getId());
		System.err.println(customer.getName());
		

	}
}