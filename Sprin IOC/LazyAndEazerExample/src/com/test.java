package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {
	
	public static void main(String[] args) {
		Resource  res= new ClassPathResource("NewFile.xml");
		BeanFactory bf= new XmlBeanFactory(res);
		Student stu=(Student) bf.getBean("s");
		System.out.println(stu);
		
		
		
		
	
		
		
		
	}

}
