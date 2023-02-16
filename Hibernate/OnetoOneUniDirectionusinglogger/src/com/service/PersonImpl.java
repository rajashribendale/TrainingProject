package com.service;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.AdharDetails;
import com.entity.Person;
import com.util.HBUtil;

public class PersonImpl implements PersonService {
	public static final Logger LOGGER = LogManager.getLogger(PersonImpl.class);

	SessionFactory sf = HBUtil.getSessionFactory();
	Session session = sf.openSession();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addPersonwithAadharDetails() {

		LOGGER.info("add data");
		LOGGER.info("how many person u want  to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Person p = new Person();
			LOGGER.info("Enter Person name");
			p.setName(sc.next());

			LOGGER.info("Enter Person adress");
			p.setAdress(sc.next());

			AdharDetails ad = new AdharDetails();

			LOGGER.info("Enter adhar card num");
			ad.setAno(sc.nextLong());

			p.setAdhardetails(ad);
			session.save(p);
			session.beginTransaction().commit();
			LOGGER.info("data inserted successfully");

		}
	}

	@Override
	public void showAllData() {
		System.out.println("Show all person details and adhar card data");
		Query<Person> query = session.createQuery("from Person");
		List<Person> list = query.getResultList();
		for (Person person : list) {
			LOGGER.debug(person.getId());
			LOGGER.debug(person.getName());
			LOGGER.debug(person.getAdress());
			LOGGER.debug(person.getAdhardetails().getAid());
			LOGGER.debug(person.getAdhardetails().getAno());

		}
	}

	@Override
	public void getSinglePersonData() {
		LOGGER.info("Enter person Id :");
		int id = sc.nextInt();

		Person person = session.get(Person.class, id);

		LOGGER.debug(person);
	}

	@Override
	public void updatePersonData() {
		LOGGER.info("Enter person Id :");
		int id = sc.nextInt();

		Person person = session.get(Person.class, id);

		LOGGER.info("Enter Person Name : ");
		person.setName(sc.next());
		LOGGER.info("Enter Person address : ");
		person.setAdress(sc.next());

		session.update(person);

		session.beginTransaction().commit();

		LOGGER.info("Person Data Updated...!");

	}

	@Override
	public void updateAadharDatausingPersonId() {
		LOGGER.info("Enter person Id :");
		int id = sc.nextInt();

		Person person = session.get(Person.class, id);
		AdharDetails ad = new AdharDetails();

		LOGGER.info("enter new adhar card no");
		ad.setAno(sc.nextLong());
		person.setAdhardetails(ad);
		session.update(person);
		session.beginTransaction().commit();
		LOGGER.info("adhar card number changed");

	}

	@Override
	public void deletePersonData() {
		Session session = sf.openSession();
		LOGGER.info("Enter Designation id");
		int id = sc.nextInt();
		Person person = session.get(Person.class, id);
		if (person != null) {
			session.delete(person);
			session.beginTransaction().commit();
			LOGGER.info("successfully deleted");
		} else {
			LOGGER.error("id not found ");
		}

	}

}
