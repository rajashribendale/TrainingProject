package com.Service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.AdharDetails;
import com.entity.Person;
import com.util.HBUtil;

public class PersonImpl implements PersonService {

	SessionFactory sf = HBUtil.getSessionFactory();
	Session session = sf.openSession();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addPersonwithAadharDetails() {

		System.out.println("add data");
		System.out.println("how many person u want  to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Person p = new Person();
			System.out.println("Enter Person name");
			p.setName(sc.next());

			System.out.println("Enter Person adress");
			p.setAdress(sc.next());

			AdharDetails ad = new AdharDetails();

			System.out.println("Enter adhar card num");
			ad.setAno(sc.nextLong());

			p.setAdhardetails(ad);
			session.save(p);
			session.beginTransaction().commit();
			System.out.println("data inserted successfully");

		}
	}

	@Override
	public void showAllData() {
		System.out.println("Show all person details and adhar card data");
		Query<Person> query = session.createQuery("from Person");
		List<Person> list = query.getResultList();
		for (Person person : list) {
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getAdress());
			System.out.println(person.getAdhardetails().getAid());
			System.out.println(person.getAdhardetails().getAno());

		}
	}

	@Override
	public void getSinglePersonData() {
		System.out.println("Enter person Id :");
		int id = sc.nextInt();

		Person person = session.get(Person.class, id);

		System.out.println(person);
	}

	@Override
	public void updatePersonData() {
		System.out.println("Enter person Id :");
		int id = sc.nextInt();

		Person person = session.get(Person.class, id);

		System.out.println("Enter Person Name : ");
		person.setName(sc.next());
		System.out.println("Enter Person address : ");
		person.setAdress(sc.next());

		session.update(person);

		session.beginTransaction().commit();

		System.out.println("Person Data Updated...!");

	}

	@Override
	public void updateAadharDatausingPersonId() {
		System.out.println("Enter person Id :");
		int id = sc.nextInt();

		Person person = session.get(Person.class, id);
		AdharDetails ad = new AdharDetails();

		System.out.println("enter new adhar card no");
		ad.setAno(sc.nextLong());
		person.setAdhardetails(ad);
		session.update(person);
		session.beginTransaction().commit();
		System.out.println("adhar card number changed");

	}

	@Override
	public void deletePersonData() {
		Session session = sf.openSession();
		System.out.println("Enter Person id");
		int id = sc.nextInt();
		Person person = session.get(Person.class, id);
		if (person != null) {
			session.delete(person);
			session.beginTransaction().commit();
			System.out.println("successfully deleted");
		} else {
			System.out.println("id not found ");
		}

	}

	@Override
	public void deleteadhardetailsusingPersonId() {
		Session session = sf.openSession();
		System.out.println("Enter Person id");
		int id = sc.nextInt();
		Person person = session.get(Person.class, id);
		
		if (person != null) {
			AdharDetails ad=person.getAdhardetails();
			person.setAdhardetails(null);
			session.update(person);
			session.delete(ad);
			session.beginTransaction().commit();
			System.out.println("successfully deleted");
		} else {
			System.out.println("id not found ");
		}
		
	}

}
