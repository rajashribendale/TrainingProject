package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf = hibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		System.out.println("how many product u want to add");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 for (int i = 1; i <=n; i++) {
			 Product p=new Product();
			 System.out.println("enter product id");
			 int pid=sc.nextInt();
			 p.setPid(pid);
			 
			 System.out.println("enter product name");
			 String pname=sc.next();
			 p.setPname(pname);
			 
			 System.out.println("Enter product type");
			 String pnm=sc.next();
			 p.setPtype(pnm);
			 
			 System.out.println("Enetr price of product");
			 Double price=sc.nextDouble();
			 p.setPrice(price);
			 
			 
			 session.save(p);
			
		}

//		Product p = new Product();
//		p.setPid(102);
//		p.setPname("Mobile");
//		p.setPtype("ele");
//		p.setPrice(15000);
//
//		session.save(p);

		Employee e = new Employee();
		e.setId(15);
		e.setName("A");
		session.save(e);
		session.beginTransaction().commit();
		System.out.println("data inserted");
	}
}
