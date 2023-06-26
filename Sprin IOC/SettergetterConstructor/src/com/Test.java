package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("com/college.xml","com/NewFile.xml");
		
		student stu=(student) apc.getBean("s");
		System.out.println(stu);
		
		
		college clg=(college) apc.getBean("c");
		System.out.println(clg);
		
		
		System.out.println("***************************************");
		ApplicationContext apc1=new FileSystemXmlApplicationContext("D:\\Rajashri\\Spring Notes\\User.xml");
		User user=(User) apc1.getBean("u");
		System.out.println(user);
		
	}

}
