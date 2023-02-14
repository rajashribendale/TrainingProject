package com.mix;

import com.mix.AllStudent;

public class College extends student {

	public static void M1() {
		System.out.println("Btach no 24 All Students");
	}

	public static void M1(String s) {
		System.out.println("JAVA CLASSES");
	}

	public void GetStudentDetails() {
		student s = new student();
		System.out.println(Institutename);
		System.out.println("*********************");

		s.setId(11);
		s.setMobileno(987654321l);
		s.setName("rajshri");
		
		System.out.println(s.getId());
		System.out.println(s.getMobileno());
		System.out.println(s.getName());
		System.out.println("******************");

	}

	public void getAllStudent() {
		AllStudent all = new AllStudent();
		all.s1.setId(101);
		all.s1.setMobileno(87654943l);
		all.s1.setName("ABc");

		System.out.println(all.s1.getId());
		System.out.println(all.s1.getMobileno());
		System.out.println(all.s1.getName());

		System.out.println("**************************");
		all.s2.setId(102);
		all.s2.setMobileno(786543567l);
		all.s2.setName("Xyz");

		System.out.println(all.s2.getId());
		System.out.println(all.s2.getMobileno());
		System.out.println(all.s2.getName());

	}

	public static void M1(int i) {
		System.out.println("Grade Obtained ");
		int marks = 80;
		if (marks > 70) {
			System.out.println("distinction ");
		} else {
			System.out.println("firstclass");
		}
		if (marks > 60) {
			System.out.println("A");
		} else if (marks >= 40) {
			System.out.println("B");

		}
	}

	public static void main(String[] args) {

		M1();
		M1("java");
		College c = new College();
		c.m1();
		c.GetStudentDetails();
		c.getAllStudent();

		System.out.println("****************************");

		M1(10);

	}

}
