package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("NewFile.xml");
		BeanFactory beanfactory=new XmlBeanFactory(resource);
		Connection conn=(Connection) beanfactory.getBean("m");
		conn.conOn();
		conn.conOf();
		
		 conn=(Connection) beanfactory.getBean("o");
		conn.conOn();
		conn.conOf();
		
		
		
	}

}
