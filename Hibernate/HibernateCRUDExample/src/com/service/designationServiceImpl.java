package com.service;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.Designation;
import com.util.hibernateUtil;

public class designationServiceImpl implements designationService {

	SessionFactory sf=hibernateUtil.getSessionFactory();
	Scanner sc=new Scanner(System.in);
//	public designationServiceImpl() {
//		System.out.println("Constructor Called");
//	}
//	
	@Override
	public void addDesignationData() {
		System.out.println("Add data ");
		Session session=sf.openSession();
		System.out.println("how many peoples u want to add");
		int n=sc.nextInt();
		for (int i = 0; i <n; i++) {
			
		Designation d=new Designation();
		
		System.out.println("Enter Designation name");
		d.setName(sc.next());
		
		System.out.println("Enter Designation Domain");
		d.setDomain(sc.next());
		session.save(d);
		session.beginTransaction().commit();
		System.out.println("data inserted succefully");
		}
		
	}

	@Override
	public void showAllData() {
		Session session=sf.openSession();
		Query<Designation> query=session.createQuery(" from Designation");
		List<Designation>list=query.getResultList();
		for (Designation designation : list) {
			System.out.println(designation);
			
		}
	}

	@Override
	public void getSingleData() {
		Session sesion=sf.openSession();
		System.out.println("Enter Designation id");
		int id=sc.nextInt();
		Designation designation=sesion.get(Designation.class,id);
		if(designation!=null) {
			System.out.println("Data:"+designation);
		}
		
	}

	@Override
	public void updateData() {
		Session session=sf.openSession();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("****CHOOSE OPTIONS****");
			System.out.println("1.Change Designation");
			System.out.println("2.Change Domain");
		
		
		System.out.println("enter designation id");
		int id=sc.nextInt();
		Designation designation=session.get(Designation.class, id);
		int ch=sc.nextInt();
		if(designation!=null) {
			
		
		switch (ch) {
		case 1:
			System.out.println("Enter Designation name u want to change");
			designation.setName(sc.next());
			break;
		case 2:
			System.out.println("Enter Designation domain u want to change");
			designation.setDomain(sc.next());
			break;

		default:
			System.out.println("wrong choice ...Please reEnter ");
			break;
		}
		session.update(designation);
		session.beginTransaction().commit();
		System.out.println("updated succefully");
	}else {
		System.out.println("id not found");
	}
		}
	}

	@Override
	public void deleteData() {
		Session session=sf.openSession();
		System.out.println("Enter Designation id");
		int id=sc.nextInt();
		Designation designation=session.get(Designation.class, id);
		if(designation!=null) {
			session.delete(designation);
			session.beginTransaction().commit();
			System.out.println("successfully deleted");
		}else {
			System.out.println("id not found");
		}
		
	}

}
