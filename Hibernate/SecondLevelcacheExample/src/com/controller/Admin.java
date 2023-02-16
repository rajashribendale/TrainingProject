package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Util.hibernateUtil;
import com.entity.Student;

public class Admin {
	public static void main(String[] args) {
		
		SessionFactory sf=hibernateUtil.getsFactory();
		Session sc=sf.openSession();
		
//		Student s=new Student();
//		s.setId(222);
//		s.setName("ABC");
//		s.setAdress("pcmc");
//		
//		sc.save(s);
//		sc.beginTransaction().commit();
//		System.out.println("data inserted");
		
		Student s=sc.get(Student.class, 111);
		System.out.println(s);
		System.out.println("*********************************");
		
		Session sc2=sf.openSession();
		Student s1=sc2.get(Student.class, 111);
		
		
		System.out.println(s1);
		
	}

}
