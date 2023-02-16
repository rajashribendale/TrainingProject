package com.admin;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Car;
import com.entity.CarDriver;
import com.util.hibernateUtil;

public class Controller {
	public static void main(String[] args) {
		SessionFactory sf = hibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		System.out.println("how many car details u want to add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			Car car = new Car();
			System.out.println("Enter Car name");
			String cname = sc.next();
			car.setCanme(cname);

			System.out.println("Enter type of car ");
			String ctype = sc.next();
			car.setCtype(ctype);
			session.save(car);
		}

		System.out.println("how many car driver details u want to add");
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc.nextInt();
		for (int i1 = 1; i1 <= n; i1++) {
			CarDriver cd = new CarDriver();
			System.out.println("Enter carDriver name");
			String cdname = sc.next();
			cd.setCdname(cdname);

			System.out.println("Enter car Driver adress of car ");
			String cdtype = sc.next();
			cd.setAddress(cdtype);
			session.save(cd);

		}

		session.beginTransaction().commit();
		System.out.println("data inserted");

	}
	

}
