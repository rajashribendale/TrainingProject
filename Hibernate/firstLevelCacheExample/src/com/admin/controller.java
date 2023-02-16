package com.admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Util.hibernateUtil;
import com.entity.Product;

public class controller {
	public static void main(String[] args) {
		SessionFactory sf=hibernateUtil.getSessionFactory();
		Session session=sf.openSession();
//		Product p=new Product();
//		p.setId(12);
//		p.setName("pqr");
//		p.setPrice(4000);
//		session.save(p);
//		session.beginTransaction().commit();
//		System.out.println("done");
//		
//		Product p=session.get(Product.class, 12);
//		System.out.println(p);
//		session.evict(p);
////		session.clear();
//		
//		Product p1=session.get(Product.class, 12);
//		System.out.println(p1);
//		Product p=new Product();
		Product p11=session.load(Product.class, 12);
		System.out.println(p11.getId());
		System.out.println(p11.getName());
		System.out.println(p11.getPrice());
		
		System.out.println("done");
		
		
		
		
		
	}

}
