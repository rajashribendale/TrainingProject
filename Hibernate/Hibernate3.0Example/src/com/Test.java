package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Employee e=new Employee();
		e.setId(11);
		e.setName("ABC");
		e.setAdress("pune");
		session.save(e);
		session.beginTransaction().commit();
		System.out.println("data inserted succefully");
	}
}
