package com.admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Customer;
import com.entity.OrderData;
import com.util.hibernateUtil;

public class Controller {
public static void main(String[] args) {
	SessionFactory sf= hibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	Customer c=new Customer();
	c.setCname("ABCD");
	c.setCadress("akurdi");
	
	OrderData od=new OrderData();
	od.setOname("Watch");
	od.setOmaode("cash");
	
	
	session.save(c);
	session.save(od);
	session.beginTransaction().commit();
	System.out.println("data inserted");
}
}
