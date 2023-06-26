package com.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		Amazon amazon = (Amazon) apc.getBean("a");
		System.out.println(amazon);
		


	}

}
