package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Util.hibernateUtil;
import com.entity.Student;

public class dirtycheck {
	public static void main(String[] args) {
		SessionFactory sf=hibernateUtil.getsFactory();
		Session sc=sf.openSession();
		
		Student s= sc.get(Student.class, 111);
		System.out.println(s);
		
		s.setName("A");
		sc.update(s);
		sc.beginTransaction().commit();
		System.out.println("data updated");
	}

}
