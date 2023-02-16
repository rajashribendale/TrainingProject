package com.admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.student;
import com.util.hibernateUtil;

public class controller {
	public static void main(String[] args) {

		SessionFactory sf = hibernateUtil.getasessSessionFactory();
		Session session = sf.openSession();
		student s = new student();
		s.setName("rajshri");
		s.setAdress("pune");

		session.save(s);
		session.beginTransaction().commit();
		System.out.println("data inserted");

	}
}